/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Protectora;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Easyklk
 */
public class GestionarProtectora {

    public static ArrayList<Protectora> obtenerProtectora(String cif) {
        String values = "cif=" + cif;
        String resultado = Utilidades.HttpRequest.GET_REQUEST(Constantes.URL_LISTADOS_PROTECTORA_CIF, values);
        System.out.println(resultado);
        if (resultado.equals("false")) {
//            return false;
        }

        Gson gson = new Gson();
        TypeToken<List<Protectora>> listToken = new TypeToken<List<Protectora>>() {
        };
        java.lang.reflect.Type listType = listToken.getType();
        ArrayList<Protectora> listaProtectora = gson.fromJson(resultado, listType);

        return listaProtectora;
    }

}
