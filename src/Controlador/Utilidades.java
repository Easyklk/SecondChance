/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.ClienteFTP;

/**
 *
 * @author Easyklk
 */
public class Utilidades {

    public static boolean subirFTP(String nombre, String rutaArchivoLocal) {
        String servidor = "localhost", usuario = "admin", clave = "1234";
        ClienteFTP cliente = new ClienteFTP(servidor);
        cliente.subirArchivo(nombre, rutaArchivoLocal);
        return false;
    }

}
