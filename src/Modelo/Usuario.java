/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author UsuarioPracticas
 */
public class Usuario {

    private String email;
    private String password;
    private boolean voluntario;
    private boolean administrador;

    public Usuario() {
        this.email = "";
        this.password = "";
        this.voluntario = false;
        this.administrador = false;
    }

    public Usuario(String email, String password, boolean voluntario, boolean administrador) {
        this.email = email;
        this.password = password;
        this.voluntario = voluntario;
        this.administrador = administrador;
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

    public boolean isVoluntario() {
        return voluntario;
    }

    public void setVoluntario(boolean voluntario) {
        this.voluntario = voluntario;
    }

    @Override
    public String toString() {
        return "Usuario{" + "email:" + email + ", es voluntario:" + voluntario + ", es administrador:" + administrador + '}';
    }

}
