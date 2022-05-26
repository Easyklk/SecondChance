/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Protectora;
import Modelo.Usuario;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author UsuarioPracticas
 */
public class GestionarUsuario {

//    public static void main(String[] args) {
//        leerUsuarios();
//    }
    public static void leerUsuarios(ArrayList<Usuario> arrayListUsuarios) {
        for (Usuario listaUsuario : arrayListUsuarios) {
            System.out.println(listaUsuario.toString());
        }
    }

    public static ArrayList listarUsuarios() {
        String resultado = HttpRequest.GET_REQUEST_SIN_PARAMETROS(Constantes.URL_LISTADOS_USUARIO);
        if (resultado.equals("false")) {
//            return false;
            System.out.println("False");
        }
        Gson gson = new Gson();
        TypeToken<List<Usuario>> listToken = new TypeToken<List<Usuario>>() {
        };
        java.lang.reflect.Type listType = listToken.getType();
        ArrayList<Usuario> listaAdministrador = gson.fromJson(resultado, listType);
        return listaAdministrador;
    }

    public static Usuario obtenerUsuario(String email) {
        String values = "email=" + email;
        String resultado = HttpRequest.GET_REQUEST(Constantes.URL_LISTADOS_USUARIO_EMAIL, values);
        System.out.println(resultado);
        if (resultado.equals("false")) {
//            return false;
        }

        Gson gson = new Gson();
        TypeToken<List<Usuario>> listToken = new TypeToken<List<Usuario>>() {
        };
        java.lang.reflect.Type listType = listToken.getType();
        ArrayList<Usuario> listaUsuario = gson.fromJson(resultado, listType);

        return listaUsuario.get(0);
    }

    public static String insertarUsuario(Usuario usuario) {
        String values = "email=" + usuario.getEmail() + "&password=" + usuario.getPassword() + "&voluntario=" + usuario.getVoluntario()
                + "&protectora=" + usuario.getProtectora() + "&administrador=" + usuario.getAdministrador();
        System.out.println(values);
        String resultado = HttpRequest.POST_REQUEST(Constantes.URL_INSERT_USUARIO, values);
        return resultado;
    }

    public static String eliminarUsuario(Usuario usuario) {
        String values = "email=" + usuario.getEmail();
        String resultado = HttpRequest.POST_REQUEST(Constantes.URL_DELETE_USUARIO, values);
        return resultado;
    }
}
