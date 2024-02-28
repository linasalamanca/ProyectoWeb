package com.example.estrellitasweb.model;

public class Jugador {
    private String rol;
    private String usuario;
    private String contrasena;
    public String getRol() {
        return rol;
    }
    public void setRol(String rol) {
        this.rol = rol;
    }
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getContrasena() {
        return contrasena;
    }
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    public Jugador(String rol, String usuario, String contrasena) {
        this.rol = rol;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    
    
}
