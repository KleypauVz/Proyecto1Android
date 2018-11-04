package com.example.android.sweetlab;

import java.io.Serializable;

public class Datos implements Serializable {

    private int chuche;
    private String nombre;

    public Datos(int chuche,String nombre){
        this.chuche=chuche;
        this.nombre=nombre;

    }

    public int getChuche() {
        return chuche;
    }

    public String getNombre() {
        return nombre;
    }
}
