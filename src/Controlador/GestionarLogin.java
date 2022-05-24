/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Usuario;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author UsuarioPracticas
 */
public class GestionarLogin {

    public static boolean logueo(String email, String password) {
        String values = "email=" + email + "&password=" + password;
        String resultado = Utilidades.HttpRequest.GET_REQUEST(Constantes.URL_LOGUEO, values);
//        System.out.println(resultado);
        if (resultado.equals("false")) {
            return false;
        }

        Gson gson = new Gson();
        TypeToken<List<Usuario>> listToken = new TypeToken<List<Usuario>>() {
        };
        java.lang.reflect.Type listType = listToken.getType();
        ArrayList<Usuario> listaAdministrador = gson.fromJson(resultado, listType);

        return listaAdministrador.size() > 0;
    }

}
