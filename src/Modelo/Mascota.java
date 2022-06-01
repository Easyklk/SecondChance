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

    private String codIdentificador;
    private String nombre;
    private String especie;
    private String raza;
    private String fecha_acogida;
    private String foto;
    private String cif_protectora;
    private String descripcion;

    public Mascota() {
        this.codIdentificador = "";
        this.nombre = "";
        this.especie = "";
        this.raza = "";
        this.fecha_acogida = "";
        this.foto = "";
        this.cif_protectora = "";
        this.descripcion = "";
    }

    public Mascota(String codIdentificador, String nombre, String especie, String raza, String fecha_acogida, String foto, String cif_protectora, String descripcion) {
        this.codIdentificador = codIdentificador;
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.fecha_acogida = fecha_acogida;
        this.foto = foto;
        this.cif_protectora = cif_protectora;
        this.descripcion = descripcion;
    }

    public String getCodIdentificador() {
        return codIdentificador;
    }

    public void setCodIdentificador(String codIdentificador) {
        this.codIdentificador = codIdentificador;
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
        return fecha_acogida;
    }

    public void setFechaAcogida(String fechaAcogida) {
        this.fecha_acogida = fechaAcogida;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getCifProtectora() {
        return cif_protectora;
    }

    public void setCifProtectora(String cifProtectora) {
        this.cif_protectora = cifProtectora;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Mascota{" + "Identificador:" + codIdentificador + ", Nombre:" + nombre + ", Especie:" + especie + ", Raza:" + raza + ", Fecha de Acogida:" + fecha_acogida + ", Foto:" + foto + ", CIF Protectora:" + cif_protectora + ", Descripcion:" + descripcion + '}';
    }

}
