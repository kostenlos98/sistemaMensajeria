package negocio;

import base.ComunicacionDirectorio;
import base.ComunicacionEmisor;
import base.ComunicacionReceptor;

import base.Desencriptadora;

import interfaces.ICargaConfig;
import interfaces.IDesencriptacion;
import interfaces.IRecepcionMensaje;
import interfaces.IUsuario;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import presentacion.IVentanaReceptor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;

import java.net.Socket;

import java.nio.charset.StandardCharsets;

import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;

import java.time.format.DateTimeFormatter;

public class GestorRecepcionMensajes extends Persona implements ActionListener,IUsuario,ICargaConfig,IRecepcionMensaje{
	
    private String IPDirectorio, puertoDirectorio,IPMensajeria,puertoMensajeria,IPDirRedundante,PuertoDirRedundante;
    private static GestorRecepcionMensajes _instancia = null;
    private IVentanaReceptor ventanaReceptor;
    private boolean RMocupado=false;
    private final String regex=", *";
    private final String decoder="UTF8";
    private final int cantDatos=2;
    private IDesencriptacion desencriptador;
        
	
    private GestorRecepcionMensajes() {
    	super();
    }

    public void setDesencriptador(IDesencriptacion desencriptador) {
        this.desencriptador = desencriptador;
    }

    public IDesencriptacion getDesencriptador() {
        return desencriptador;
    }

    public String getIPDirectorio() {
        return IPDirectorio;
    }

    public String getPuertoDirectorio() {
        return puertoDirectorio;
    }

    /**
     * Thread-protected Singleton
     * @return
     */
    public synchronized static GestorRecepcionMensajes getInstancia()
    {
        if(_instancia == null)
            _instancia = new GestorRecepcionMensajes();
        return _instancia;
    }
    
	private void setSound(String sound){
        try {
            //URL url = this.getClass().getClassLoader().getResource("incomingsound.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(new File("resource/incomingsound.wav").getAbsoluteFile());
            this.ventanaReceptor.setClip(AudioSystem.getClip());
            this.ventanaReceptor.getClip().open(audioIn);
         } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
         } catch (IOException e) {
            e.printStackTrace();
         } catch (LineUnavailableException e) {
            e.printStackTrace();
         }
    }
	
    public synchronized void recibirMensaje(String str){
        while(RMocupado==true){
            try{
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        RMocupado=true;
    	try {
            byte[] asuntoDesencriptado, textoDesencriptado;
    	    javax.xml.bind.JAXBContext context = javax.xml.bind.JAXBContext.newInstance(MensajeEmisor.class);
    	    javax.xml.bind.Unmarshaller unmarshaller = context.createUnmarshaller();
    	    StringReader reader = new StringReader(str);
    	    Mensaje mensaje = (MensajeEmisor) unmarshaller.unmarshal(reader);
            asuntoDesencriptado = this.getDesencriptador().desencriptar(mensaje.getAsunto());
            textoDesencriptado = this.getDesencriptador().desencriptar(mensaje.getTexto());
            mensaje.setAsunto(asuntoDesencriptado);
            mensaje.setTexto(textoDesencriptado);
            this.ventanaReceptor.actualizaListaMensajes(mensaje);
            if(mensaje.getTipo() == 1) {
            	this.setSound(IVentanaReceptor.ALERT_SOUND_URL);
            	this.ventanaReceptor.lanzarAlerta(mensaje.getEmisor().getNombre());
            }
            else if(mensaje.getTipo() == 2) {
                ComunicacionReceptor.getInstancia().informarMensajeRecibido(this.getNombre()+"-"+mensaje.getFecha());
            }
            }catch (Exception e){
                e.printStackTrace();
            }
        RMocupado=false;
        notifyAll();
    }
    
    
    public void pedirMensajesPendientes()
    {
        ComunicacionReceptor.getInstancia().pedirMensajesPendientes(this.getNombre(),this.getIPMensajeria(),this.getPuertoMensajeria()); //UPDATE
    }
    
    public void lanzarCartelError(String err) {
    	this.ventanaReceptor.lanzarCartelError(err);
    }
    
    public void setVentanaReceptor(IVentanaReceptor ventanaReceptor) {
        this.ventanaReceptor = ventanaReceptor;
        this.ventanaReceptor.addActionListener(this);
    }

    public void configAtributos(String nombre) {
        this.setNombre(nombre);
    }
	
    public boolean iniciarSesion(){
        UsuarioReceptor usuario = new UsuarioReceptor(this.getNombre(), this.getIP(), this.getPuerto());
        try{
            this.cargarKeys();
            usuario.setPublicKey(this.getDesencriptador().getPublicKey()); 
            javax.xml.bind.JAXBContext context = javax.xml.bind.JAXBContext.newInstance(UsuarioReceptor.class);
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FORMATTED_OUTPUT, true);
            StringWriter sw = new StringWriter();
            marshaller.marshal(usuario, sw);
            try{
                try{
                    ComunicacionReceptor.getInstancia().iniciarSesion(sw, InetAddress.getByName(this.getIPDirRedundante()), Integer.parseInt(this.getPuertoDirRedundante()));
                }catch(IOException e){
                    ComunicacionReceptor.getInstancia().iniciarSesion(sw, InetAddress.getByName(this.getIPDirectorio()), Integer.parseInt(this.getPuertoDirectorio()));
                }
                this.ventanaReceptor.mostrarVentana();
                this.pedirMensajesPendientes();
                ComunicacionReceptor.getInstancia().escucharPuerto(this.getPuerto());
                ComunicacionReceptor.getInstancia().heartbeat(sw,InetAddress.getByName(this.getIPDirRedundante()), Integer.parseInt(this.getPuertoDirRedundante()),InetAddress.getByName(this.getIPDirectorio()), Integer.parseInt(this.getPuertoDirectorio()),this.getNombre());
                return true;
            }catch(IOException e){
                this.lanzarCartelError("El directorio no esta disponible");
                this.ventanaReceptor.getJDiagSesionRecep().setVisible(true);
                return false;
            } catch (Exception e){
                this.lanzarCartelError("No se pudo iniciar la sesi�n");
                this.ventanaReceptor.getJDiagSesionRecep().setVisible(true);
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public void notificarDesconexionDirectorio() {
        try {
            ComunicacionReceptor.getInstancia()
                .notificarDesconexionDirectorio(this.getNombre(),
                                                InetAddress.getByName(this.getIPDirRedundante()),
                                                Integer.parseInt(this.getPuertoDirRedundante()));
        } catch (IOException e) {
            try {
                ComunicacionReceptor.getInstancia()
                .notificarDesconexionDirectorio(this.getNombre(), 
                                                InetAddress.getByName(this.getIPDirectorio()),
                                                Integer.parseInt(this.getPuertoDirectorio()));
            } catch (IOException f) {
                this.lanzarCartelError("ERROR al notificar al Directorio la desconexion");
            }
        }
    }
    
    public void cargarDatosConfig(String s){
        BufferedReader br;
        String[] datos;

        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream(s), decoder));
            String linea = br.readLine();
            while(linea!=null){
                datos=linea.split(regex);
                this.IPDirectorio=datos[0];
                this.puertoDirectorio=datos[1];
                this.IPMensajeria=datos[2];
                this.puertoMensajeria=datos[3];
                this.IPDirRedundante=datos[4];
                this.PuertoDirRedundante=datos[5];
                linea = br.readLine();
            }
            br.close();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public String getIPMensajeria()
    {
        return IPMensajeria;
    }

    public String getPuertoMensajeria()
    {
        return puertoMensajeria;
    }

    @Override
    public void actionPerformed(ActionEvent arg) {
        String comando = arg.getActionCommand();
        if (comando.equalsIgnoreCase("ABRIR MENSAJE"))
            this.ventanaReceptor.abrirMensaje();
        else if (comando.equalsIgnoreCase("CERRAR MENSAJE"))
            this.ventanaReceptor.cerrarMensaje();
        else if (comando.equalsIgnoreCase("PARAR ALERTA"))
            this.ventanaReceptor.pararAlerta();
        else  if (comando.equalsIgnoreCase("ACEPTAR SESION"))
            this.ventanaReceptor.confirmarSesion();
    }
    
    public void setearPuerto(String p)
    {
        super.setPuerto(p);
    }

    private void cargarKeys() throws NoSuchAlgorithmException, NoSuchProviderException {
        if(this.getDesencriptador().isYaExistenKeys(this.getNombre())){
            this.getDesencriptador().recuperarKeys(this.getNombre());
        }
        else{
            this.getDesencriptador().setNewKeys();
            this.getDesencriptador().persistirKeys(this.getNombre());
        }
    }

    public String getIPDirRedundante() {
        return IPDirRedundante;
    }

    public String getPuertoDirRedundante() {
        return PuertoDirRedundante;
    }
}
