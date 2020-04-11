package negocio;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Mensaje {
	private String asunto;
	private String texto;
	private Persona emisor;
	private int tipo;
        
    public Mensaje() {
            super();
    }
	
	public Mensaje(String asunto, String texto, Persona emisor, int tipo) {
		super();
		this.asunto = asunto;
		this.texto = texto;
		this.emisor = emisor;
		this.tipo = tipo;
	}

    @Override
        public String toString() {
            return ((tipo == 1) ? " [!] " : "     ") + "De: " + emisor.toString() + " Asunto: " + asunto;
        }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public void setEmisor(Persona emisor) {
        this.emisor = emisor;
    }

    public Persona getEmisor() {
        return emisor;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getTipo() {
        return tipo;
    }
}