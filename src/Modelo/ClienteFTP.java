package Modelo;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.net.ftp.FTP;

import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPReply;

public class ClienteFTP {

    private FTPClient cliente;
    private String directorioInicial;
    private int estadoConexion = -1;

    /**
     * Crea cliente ftp y conecta un servidor ftp
     *
     * @param servidor nombre del servidor ftp
     */
    public ClienteFTP(String servidor) {
        //crea cliente FTPClient
        cliente = new FTPClient();
        try {
            //Abre conexion el cliente con el servidor
            cliente.connect(servidor);
            //Y comprobamos la conexion y guardamos su estado en 'estadoConexion'
            estadoConexion = cliente.getReplyCode();
            loguear("admin", "1234");
            comprobarConexion(estadoConexion);
        } catch (IOException ex) {
            ex.printStackTrace();
//            Logger.getLogger(ClienteFTP.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getDirectorioInicial() {
        return directorioInicial;
    }

    public void setDirectorioInicial(String directorioInicial) {
        this.directorioInicial = directorioInicial;
    }

    /**
     * Comprobamos el estado de la conexion al servidor FTP Si es satisfactoria
     * retorna true; false en caso contrario
     *
     * @param conexion
     * @return true si la conexion es correcta; false en caso contrario
     */
    public boolean comprobarConexion(int conexion) {
        //si la conexion  es satisfactoria
        return FTPReply.isPositiveCompletion(conexion);
    }

    /**
     * Abre una sesion ftp con una cuenta de usuario pasada como parametro
     *
     * @param usuario
     * @param clave
     * @return true si se abre correctamente; false en caso contrario.
     */
    public boolean loguear(String usuario, String clave) {
        boolean logeado = false;
        try {
            //loguear al usuario
            logeado = cliente.login(usuario, clave);
            //si se loguea correctamente guardar en la variable directorioIncial la
            //ruta de su directorio de trabajo
            if (logeado) {
                this.directorioInicial = cliente.printWorkingDirectory();
            }

        } catch (IOException ex) {
            ex.printStackTrace();
            Logger.getLogger(ClienteFTP.class.getName()).log(Level.SEVERE, null, ex);
        }
        return logeado;
    }

    /**
     * Muestra el directorio actual de trabajo
     *
     * @return en forma de cadena
     */
    public String mostrarRutaDirectorioActual() {
        String ruta = "";
        try {
            ruta = cliente.printWorkingDirectory();
        } catch (IOException ex) {
            ex.printStackTrace();
            Logger.getLogger(ClienteFTP.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ruta;
    }

    public boolean subirArchivo(String nombre, String rutaArchivoLocal) {
        boolean subida = false;
        try {
            cliente.setFileType(FTP.BINARY_FILE_TYPE);
            BufferedInputStream in = new BufferedInputStream(new FileInputStream(rutaArchivoLocal + "/" + nombre));
            subida = cliente.storeFile(nombre, in);
            if (subida == true) {
                System.out.println("Archivo subido correctamente!!");
            } else {
                System.out.println("Archivo no se subio!!");
            }
            in.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            Logger.getLogger(ClienteFTP.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            ex.printStackTrace();
            Logger.getLogger(ClienteFTP.class.getName()).log(Level.SEVERE, null, ex);
        }
        return subida;
    }

    public boolean descargarArchivo(String nombre, String rutaDestinoLocal) {
        boolean descargado = false;
        try {
            FileOutputStream ficheroObtenido = new FileOutputStream(nombre);
            System.out.println("\nDescargando el fichero " + nombre + " de "
                    + "la carpeta " + rutaDestinoLocal);
            descargado = cliente.retrieveFile("/" + rutaDestinoLocal + "/"
                    + nombre, ficheroObtenido);
            ficheroObtenido.close();
        } catch (IOException ex) {
            ex.printStackTrace();
            Logger.getLogger(ClienteFTP.class.getName()).log(Level.SEVERE, null, ex);
        }
        return descargado;

    }

    public void desconectar() {
        try {
            cliente.disconnect();
        } catch (IOException ex) {
            Logger.getLogger(ClienteFTP.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean comprobarConexion() {
        return FTPReply.isPositiveCompletion(estadoConexion);
    }

}
