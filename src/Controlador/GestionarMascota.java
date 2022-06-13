/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Mascota;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Isaac-PC
 */
public class GestionarMascota {

    public static Mascota obtenerMascotaCodCifProtectora(String codMascota, String cifProtectora) {
        String values = "codIdentificador=" + codMascota + "&cif_Protectora=" + cifProtectora;
        String array = HttpRequest.GET_REQUEST(Constantes.URL_LISTADOS_MASCOTA_COD_CIF_PROTECTORA, values);
        String resultado = array.substring(1, array.length() - 1);
        Gson gson = new Gson();
        Mascota mascota = gson.fromJson(resultado, Mascota.class);
        return mascota;
    }

    public static Mascota obtenerMascotaCod(String codMascota) {
        String values = "codIdentificador=" + codMascota;
        String array = HttpRequest.GET_REQUEST(Constantes.URL_LISTADOS_MASCOTA_COD, values);
        String resultado = array.substring(1, array.length() - 1);
        Gson gson = new Gson();
        Mascota mascota = gson.fromJson(resultado, Mascota.class);
        return mascota;
    }

    public static ArrayList<Mascota> listarMascotas() {
        String resultado = HttpRequest.GET_REQUEST_SIN_PARAMETROS(Constantes.URL_LISTADOS_MASCOTA);
        Gson gson = new Gson();
        TypeToken<List<Mascota>> listToken = new TypeToken<List<Mascota>>() {
        };
        java.lang.reflect.Type listType = listToken.getType();
        ArrayList<Mascota> alMascota = gson.fromJson(resultado, listType);
        return alMascota;
    }

    public static ArrayList<Mascota> listarMascotasCifProtectora(String cifProtectora) {
        String values = "cif_Protectora=" + cifProtectora;
        String resultado = HttpRequest.GET_REQUEST(Constantes.URL_LISTADOS_MASCOTA_CIF_PROTECTORA, values);
        Gson gson = new Gson();
        TypeToken<List<Mascota>> listToken = new TypeToken<List<Mascota>>() {
        };
        java.lang.reflect.Type listType = listToken.getType();
        ArrayList<Mascota> alMascota = gson.fromJson(resultado, listType);
        return alMascota;
    }

    public static String insertarMascota(Mascota mascota) {
        String values = "codIdentificador=" + mascota.getCodIdentificador() + "&nombre=" + mascota.getNombre() + "&especie=" + mascota.getEspecie() + "&raza=" + mascota.getRaza()
                + "&fechaAcogida=" + mascota.getFechaAcogida() + "&foto=" + mascota.getFoto() + "&cifProtectora=" + mascota.getCifProtectora()
                + "&descripcion=" + mascota.getDescripcion();
        String resultado = Controlador.HttpRequest.POST_REQUEST(Constantes.URL_INSERT_MASCOTA, values);
        return resultado;
    }

    public static String modificarMascota(Mascota mascota) {
        String values = "codIdentificador=" + mascota.getCodIdentificador() + "&foto=" + mascota.getFoto() + "&descripcion=" + mascota.getDescripcion();
        String resultado = Controlador.HttpRequest.POST_REQUEST(Constantes.URL_UPDATE_MASCOTA, values);
        return resultado;
    }

    public static String eliminarConsulta(Mascota mascota) {
        String values = "codIdentificador=" + mascota.getCodIdentificador();
        String resultado = HttpRequest.POST_REQUEST(Constantes.URL_DELETE_MASCOTA, values);
        return resultado;
    }

}
