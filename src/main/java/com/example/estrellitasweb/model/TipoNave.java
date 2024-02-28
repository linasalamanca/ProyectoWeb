package com.example.estrellitasweb.model;

public class TipoNave {
    private Float volumenCarga;
    private Float velocidad;
    public Float getVolumenCarga() {
        return volumenCarga;
    }
    public void setVolumenCarga(Float volumenCarga) {
        this.volumenCarga = volumenCarga;
    }
    public Float getVelocidad() {
        return velocidad;
    }
    public void setVelocidad(Float velocidad) {
        this.velocidad = velocidad;
    }
    public TipoNave(Float volumenCarga, Float velocidad) {
        this.volumenCarga = volumenCarga;
        this.velocidad = velocidad;
    }

    
}
