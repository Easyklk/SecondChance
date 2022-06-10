/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Usuario;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author UsuarioPracticas
 */
public class GestionarLogin {

    /**
     * Metodo que indica si el administrador facilitado existe
     *
     * @param email email del administrador
     * @param password password del administrador
     * @return boolean si el administrador existe
     */
    public static boolean logueoAdmin(String email, String password) {
        String values = "email=" + email + "&password=" + password;
        String resultado = HttpRequest.GET_REQUEST(Constantes.URL_LOGUEO_ADMIN, values);

        Gson gson = new Gson();
        TypeToken<List<Usuario>> listToken = new TypeToken<List<Usuario>>() {
        };
        java.lang.reflect.Type listType = listToken.getType();
        ArrayList<Usuario> arUsuarios = gson.fromJson(resultado, listType);
        return arUsuarios.size() > 0;
    }

    /**
     * Metodo que indica si la protectora facilitado existe
     *
     * @param email email de la protectora
     * @param password password de la protectora
     * @return boolean si la protectora existe
     */
    public static boolean logueoProtectora(String email, String password) {
        String values = "email=" + email + "&password=" + password;
        String resultado = HttpRequest.GET_REQUEST(Constantes.URL_LOGUEO_PROTECTORA, values);
        Gson gson = new Gson();
        TypeToken<List<Usuario>> listToken = new TypeToken<List<Usuario>>() {
        };
        java.lang.reflect.Type listType = listToken.getType();
        ArrayList<Usuario> alUsuario = gson.fromJson(resultado, listType);
        return alUsuario.size() > 0;
    }

}
