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

    private int codConsulta;
    private String codMascota;
    private String dniVoluntario;
    private String horario;
    private String informacion;

    public Consulta() {
        this.codConsulta = 0;
        this.codMascota = "";
        this.dniVoluntario = "";
        this.horario = "";
        this.informacion = "";
    }

    public Consulta(int codConsulta, String codMascota, String dniVoluntario, String horario, String informacion) {
        this.codConsulta = codConsulta;
        this.codMascota = codMascota;
        this.dniVoluntario = dniVoluntario;
        this.horario = horario;
        this.informacion = informacion;
    }

    public int getCodConsulta() {
        return codConsulta;
    }

    public void setCodConsulta(int codConsulta) {
        this.codConsulta = codConsulta;
    }

    public String getCodMascota() {
        return codMascota;
    }

    public void setCodMascota(String codMascota) {
        this.codMascota = codMascota;
    }

    public String getDniVoluntario() {
        return dniVoluntario;
    }

    public void setDniVoluntario(String dniVoluntario) {
        this.dniVoluntario = dniVoluntario;
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
        return "Consulta{" + "Codigo Consulta:" + codConsulta + ", Codigo Mascota:" + codMascota + ", DNI Voluntario:" + dniVoluntario + ", Horario:" + horario + ", Informacion:" + informacion + '}';
    }

}
