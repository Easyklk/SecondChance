/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Isaac-PC
 */
public class Voluntario {

    private String dni;
    private String nombre;
    private String apellidos;
    private String email;

    public Voluntario() {
        this.dni = "";
        this.nombre = "";
        this.apellidos = "";
        this.email = "";
    }

    public Voluntario(String dni, String nombre, String apellidos, String email) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getMail() {
        return email;
    }

    public void setMail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Voluntario{" + "DNI:" + dni + ", Nombre:" + nombre + ", Apellidos:" + apellidos + ", email:" + email + '}';
    }
}
