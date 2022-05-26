/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Isaac-PC
 */
public class Consulta {

    private int cod_consulta;
    private String cod_mascota;
    private String dni_voluntario;
    private String horario;
    private String informacion;

    public Consulta() {
        this.cod_mascota = "";
        this.dni_voluntario = "";
        this.horario = "";
        this.informacion = "";
    }

    public Consulta(String codMascota, String dniVoluntario, String horario, String informacion) {
        this.cod_consulta = cod_consulta;
        this.cod_mascota = codMascota;
        this.dni_voluntario = dniVoluntario;
        this.horario = horario;
        this.informacion = informacion;
    }

    public int getCodConsulta() {
        return cod_consulta;
    }

    public void setCodConsulta(int codConsulta) {
        this.cod_consulta = codConsulta;
    }

    public String getCodMascota() {
        return cod_mascota;
    }

    public void setCodMascota(String codMascota) {
        this.cod_mascota = codMascota;
    }

    public String getDniVoluntario() {
        return dni_voluntario;
    }

    public void setDniVoluntario(String dniVoluntario) {
        this.dni_voluntario = dniVoluntario;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getInformacion() {
        return informacion;
    }

    public void setInformacion(String informacion) {
        this.informacion = informacion;
    }

    @Override
    public String toString() {
        return "Consulta{" + "Codigo Consulta:" + cod_consulta + ", Codigo Mascota:" + cod_mascota + ", DNI Voluntario:" + dni_voluntario + ", Horario:" + horario + ", Informacion:" + informacion + '}';
    }

}
