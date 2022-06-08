/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Consulta;
import Modelo.Protectora;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Isaac-PC
 */
public class GestionarConsulta {

    /**
     * Metodo que devuelve una consulta especifica
     *
     * @param codConsulta Codigo de la consulta a obtener
     * @return Consulta a mostrar
     */
    public static Consulta obtenerConsultaCod(String codConsulta) {
        String values = "cod_consulta=" + codConsulta;
        String array = HttpRequest.GET_REQUEST(Constantes.URL_LISTADOS_CONSULTA_COD, values);
        String resultado = array.substring(1, array.length() - 1);
        Gson gson = new Gson();
        Consulta consulta = gson.fromJson(resultado, Consulta.class);
        return consulta;
    }

    /**
     * Metodo que devuelve un conjunto de consultas
     *
     * @return ArrayList con el listado completo de consultas
     */
    public static ArrayList<Consulta> listarConsultas() {
        String resultado = HttpRequest.GET_REQUEST_SIN_PARAMETROS(Constantes.URL_LISTADOS_CONSULTAS);
        Gson gson = new Gson();
        TypeToken<List<Consulta>> listToken = new TypeToken<List<Consulta>>() {
        };
        java.lang.reflect.Type listType = listToken.getType();
        ArrayList<Consulta> alConsultas = gson.fromJson(resultado, listType);
        return alConsultas;
    }

    /**
     * Metodo que inserta una consulta
     *
     * @param consulta a insertar
     * @return String codigo de inserccion correcta/incorrecta
     */
    public static String insertarConsulta(Consulta consulta) {
        String values = "cod_mascota=" + consulta.getCodMascota() + "&dni_voluntario=" + consulta.getDniVoluntario() + "&horario=" + consulta.getHorario()
                + "&informacion=" + consulta.getInformacion();
        String resultado = HttpRequest.POST_REQUEST(Constantes.URL_INSERT_CONSULTA, values);
        return resultado;
    }

    /**
     * Metodo que eliminar una consulta
     *
     * @param consulta a eliminar
     * @return String codigo de elimiacion correcta/incorrecta
     */
    public static String eliminarConsulta(Consulta consulta) {
        String values = "cod_consulta=" + consulta.getCodConsulta();
        String resultado = HttpRequest.POST_REQUEST(Constantes.URL_DELETE_CONSULTA, values);
        return resultado;
    }

}
