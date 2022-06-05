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

    public static ArrayList listarUsuarios() {
        String resultado = HttpRequest.GET_REQUEST_SIN_PARAMETROS(Constantes.URL_LISTADOS_USUARIO);
        Gson gson = new Gson();
        TypeToken<List<Usuario>> listToken = new TypeToken<List<Usuario>>() {
        };
        java.lang.reflect.Type listType = listToken.getType();
        ArrayList<Usuario> alUsuarios = gson.fromJson(resultado, listType);
        return alUsuarios;

    }

    public static Usuario obtenerUsuario(String email) {
        String values = "email=" + email;
        String array = HttpRequest.GET_REQUEST(Constantes.URL_LISTADOS_USUARIO_EMAIL, values);
        String resultado = array.substring(1, array.length() - 1);
        Gson gson = new Gson();
        Usuario usuario = gson.fromJson(resultado, Usuario.class);
        return usuario;
    }

    public static String insertarUsuario(Usuario usuario) {
        String values = "email=" + usuario.getEmail() + "&password=" + usuario.getPassword() + "&voluntario=" + usuario.getVoluntario()
                + "&protectora=" + usuario.getProtectora() + "&administrador=" + usuario.getAdministrador();
        String resultado = HttpRequest.POST_REQUEST(Constantes.URL_INSERT_USUARIO, values);
        return resultado;
    }

    public static String eliminarUsuario(Usuario usuario) {
        String values = "email=" + usuario.getEmail();
        String resultado = HttpRequest.POST_REQUEST(Constantes.URL_DELETE_USUARIO, values);
        return resultado;
    }
}
