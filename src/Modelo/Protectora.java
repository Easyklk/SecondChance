/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Easyklk
 */
public class Protectora {

    private String cif;
    private String nombre_protectora;
    private String razon_social;
    private String email;
    private String telefono;
    private String ubicacion;

    public Protectora() {
        this.cif = "";
        this.nombre_protectora = "";
        this.razon_social = "";
        this.email = "";
        this.telefono = "";
        this.ubicacion = "";
    }

    public Protectora(String cif, String nombreProtectora, String razonSocial, String email, String telefono, String ubicacion) {
        this.cif = cif;
        this.nombre_protectora = nombreProtectora;
        this.razon_social = razonSocial;
        this.email = email;
        this.telefono = telefono;
        this.ubicacion = ubicacion;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getNombreProtectora() {
        return nombre_protectora;
    }

    public void setNombreProtectora(String nombreProtectora) {
        this.nombre_protectora = nombreProtectora;
    }

    public String getRazonSocial() {
        return razon_social;
    }

    public void setRazonSocial(String razonSocial) {
        this.razon_social = razonSocial;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    @Override
    public String toString() {
        return "CIF:" + cif + ", Nombre:" + nombre_protectora + ", Razon Social:" + razon_social + ", email:" + email + ", Telefono:" + telefono + ", Ubicacion:" + ubicacion;
    }
}
