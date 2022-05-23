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
    private String nombre;
    private String razonSocial;
    private String email;
    private String password;
    private String telefono;
    private String ubicacion;

    public Protectora() {
    this.cif="";
    this.nombre="";
    this.razonSocial="";
    this.email="";
    this.password="";
    this.telefono="";
    this.ubicacion="";
    }

    public Protectora(String cif, String nombreProtectora, String razonSocial, String email, String password, String telefono, String ubicacion) {
        this.cif = cif;
        this.nombre = nombreProtectora;
        this.razonSocial = razonSocial;
        this.email = email;
        this.password = password;
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
        return nombre;
    }

    public void setNombreProtectora(String nombreProtectora) {
        this.nombre = nombreProtectora;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
        return "Protectora{" + "CIF:" + cif + ", Nombre:" + nombre + ", Razon Social:" + razonSocial + ", email:" + email + ", Telefono:" + telefono + ", Ubicacion:" + ubicacion + '}';
    }
}
