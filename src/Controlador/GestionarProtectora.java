/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Protectora;
import Modelo.Usuario;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

/**
 *
 * @author Easyklk
 */
public class GestionarProtectora {

    public static Protectora obtenerProtectoraCif(String cif) {
        String values = "cif=" + cif;
        String array = HttpRequest.GET_REQUEST(Constantes.URL_LISTADOS_PROTECTORA_CIF, values);
        String resultado = array.substring(1, array.length() - 1);
        Gson gson = new Gson();
        Protectora protectora = gson.fromJson(resultado, Protectora.class);
        return protectora;
    }

    public static Protectora obtenerProtectoraEmail(String email) {
        String values = "email=" + email;
        String array = HttpRequest.GET_REQUEST(Constantes.URL_LISTADOS_PROTECTORA_EMAIL, values);
        String resultado = array.substring(1, array.length() - 1);
        Gson gson = new Gson();
        Protectora protectora = gson.fromJson(resultado, Protectora.class);
        return protectora;
    }

    public static ArrayList<Protectora> listarProtectora() {
        String resultado = HttpRequest.GET_REQUEST_SIN_PARAMETROS(Constantes.URL_LISTADOS_PROTECTORAS);
        Gson gson = new Gson();
        TypeToken<List<Protectora>> listToken = new TypeToken<List<Protectora>>() {
        };
        java.lang.reflect.Type listType = listToken.getType();
        ArrayList<Protectora> alProtectoras = gson.fromJson(resultado, listType);
        return alProtectoras;
    }

    public static String insertarProtectora(Protectora protectora) {
        String values = "cif=" + protectora.getCif() + "&nombre_protectora=" + protectora.getNombreProtectora() + "&razon_social=" + protectora.getRazonSocial()
                + "&email=" + protectora.getEmail() + "&telefono=" + protectora.getTelefono() + "&ubicacion=" + protectora.getUbicacion();
        String resultado = HttpRequest.POST_REQUEST(Constantes.URL_INSERT_PROTECTORA, values);
        return resultado;
    }

    public static String modificarProtectora(Protectora protectora, String cifViejo) {
        String values = "cifNuevo=" + protectora.getCif() + "&nombre_protectora=" + protectora.getNombreProtectora() + "&razon_social=" + protectora.getRazonSocial()
                + "&telefono=" + protectora.getTelefono() + "&ubicacion=" + protectora.getUbicacion() + "&cif=" + cifViejo;
        String resultado = HttpRequest.POST_REQUEST(Constantes.URL_UPDATE_PROTECTORA, values);
        return resultado;
    }

    public static String eliminarPortectora(Protectora protectora) {
        String values = "cif=" + protectora.getCif();
        String resultado = HttpRequest.POST_REQUEST(Constantes.URL_DELETE_PROTECTORA, values);
        return resultado;
    }

}
