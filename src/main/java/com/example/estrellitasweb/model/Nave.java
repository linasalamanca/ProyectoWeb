package com.example.estrellitasweb.model;

import jakarta.persistence.Id;

public class Nave {
    private int dinero;
    private Float coordenadaX;
    private Float coordenadaY;
    private Float coordenadaZ;
    @Id
    private String nombre;
    private Float tiempo;
    public int getDinero() {
        return dinero;
    }
    public void setDinero(int dinero) {
        this.dinero = dinero;
    }
    public Float getCoordenadaX() {
        return coordenadaX;
    }
    public void setCoordenadaX(Float coordenadaX) {
        this.coordenadaX = coordenadaX;
    }
    public Float getCoordenadaY() {
        return coordenadaY;
    }
    public void setCoordenadaY(Float coordenadaY) {
        this.coordenadaY = coordenadaY;
    }
    public Float getCoordenadaZ() {
        return coordenadaZ;
    }
    public void setCoordenadaZ(Float coordenadaZ) {
        this.coordenadaZ = coordenadaZ;
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Float getTiempo() {
        return tiempo;
    }
    public void setTiempo(Float tiempo) {
        this.tiempo = tiempo;
    }
    public Nave(int dinero, Float coordenadaX, Float coordenadaY, Float coordenadaZ, String nombre, Float tiempo) {
        this.dinero = dinero;
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
        this.coordenadaZ = coordenadaZ;
        this.nombre = nombre;
        this.tiempo = tiempo;
    }

    
    
}
