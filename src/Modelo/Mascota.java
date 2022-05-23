/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Isaac-PC
 */
public class Mascota {

    private String codigoIdentificador;
    private String nombre;
    private String especie;
    private String raza;
    private String fechaAcogida;
    private String foto;
    private String cifProtectora;
    private String descripcion;

    public Mascota() {
        this.codigoIdentificador = "";
        this.nombre = "";
        this.especie = "";
        this.raza = "";
        this.fechaAcogida = "";
        this.foto = "";
        this.cifProtectora = "";
        this.descripcion = "";
    }

    public String getCodigoIdentificador() {
        return codigoIdentificador;
    }

    public void setCodigoIdentificador(String codigoIdentificador) {
        this.codigoIdentificador = codigoIdentificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getFechaAcogida() {
        return fechaAcogida;
    }

    public void setFechaAcogida(String fechaAcogida) {
        this.fechaAcogida = fechaAcogida;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getCifProtectora() {
        return cifProtectora;
    }

    public void setCifProtectora(String cifProtectora) {
        this.cifProtectora = cifProtectora;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Mascota{" + "Identificador:" + codigoIdentificador + ", Nombre:" + nombre + ", Especie:" + especie + ", Raza:" + raza + ", Fecha de Acogida:" + fechaAcogida + ", Foto:" + foto + ", CIF Protectora:" + cifProtectora + ", Descripcion:" + descripcion + '}';
    }

}
