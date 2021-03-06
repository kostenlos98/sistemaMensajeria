package inicio;

import base.ComunicacionDirectorio;

import negocio.GestorUsuariosReceptores;
import negocio.GestorEnvioMensajes;


public class InicioDirectorio {
    public InicioDirectorio() {
        super();
    }

    public static void main(String[] args) {
        GestorUsuariosReceptores.getInstancia().cargarDatosConfig("configDirActivo.txt");
        GestorUsuariosReceptores.getInstancia().solicitarBackUp();
        ComunicacionDirectorio.getInstancia().escucharPuerto("70");
        GestorUsuariosReceptores.getInstancia().comprobacionUsuariosOnline();
    }
}
