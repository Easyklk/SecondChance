/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Consulta;
import Modelo.Mascota;
import Modelo.Protectora;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Isaac-PC
 */
public class GestionarMascota {

    public static Mascota obtenerMascotaCod(String codMascota) {
        String values = "codIdentificador=" + codMascota;
        String resultado = HttpRequest.GET_REQUEST(Constantes.URL_LISTADOS_MASCOTA_COD, values);

        Gson gson = new Gson();
        TypeToken<List<Mascota>> listToken = new TypeToken<List<Mascota>>() {
        };
        java.lang.reflect.Type listType = listToken.getType();
        ArrayList<Mascota> alConsultas = gson.fromJson(resultado, listType);
        return alConsultas.get(0);
    }

    public static ArrayList<Mascota> listarMascotas() {
        String resultado = HttpRequest.GET_REQUEST_SIN_PARAMETROS(Constantes.URL_LISTADOS_MASCOTA);
        System.out.println(resultado.toString());
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
        return resultado.toString();
    }

    public static String modificarMascota(Mascota mascota) {
        String values = "codIdentificador=" + mascota.getCodIdentificador() + "&foto=" + mascota.getFoto() + "&descripcion=" + mascota.getDescripcion();
        String resultado = Controlador.HttpRequest.POST_REQUEST(Constantes.URL_UPDATE_MASCOTA, values);
        return resultado.toString();
    }

    public static String eliminarConsulta(Consulta consulta) {
        String values = "cod_consulta=" + consulta.getCodConsulta();
        String resultado = HttpRequest.POST_REQUEST(Constantes.URL_DELETE_CONSULTA, values);
        return resultado;
    }

}