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

    public static String getMD5(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(input.getBytes());
            BigInteger number = new BigInteger(1, messageDigest);
            String hashtext = number.toString(16);

            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean logueoAdmin(String email, String password) {
        String values = "email=" + email + "&password=" + getMD5(password);
        String resultado = Utilidades.HttpRequest.GET_REQUEST(Constantes.URL_LOGUEO_ADMIN, values);
//        System.out.println(resultado);
        if (resultado.equals("false")) {
            return false;
        }

        Gson gson = new Gson();
        TypeToken<List<Usuario>> listToken = new TypeToken<List<Usuario>>() {
        };
        java.lang.reflect.Type listType = listToken.getType();
        ArrayList<Usuario> arUsuarios = gson.fromJson(resultado, listType);

        return arUsuarios.size() > 0;
    }

    public static boolean logueoProtectora(String email, String password) {
        String values = "email=" + email + "&password=" + getMD5(password);
        String resultado = Utilidades.HttpRequest.GET_REQUEST(Constantes.URL_LOGUEO_PROTECTORA, values);
        System.out.println(resultado);
        if (resultado.equals("false")) {
            return false;
        }

        Gson gson = new Gson();
        TypeToken<List<Usuario>> listToken = new TypeToken<List<Usuario>>() {
        };
        java.lang.reflect.Type listType = listToken.getType();
        ArrayList<Usuario> alUsuario = gson.fromJson(resultado, listType);
        return alUsuario.size() > 0;
    }

}
