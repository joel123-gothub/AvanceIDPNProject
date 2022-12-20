package com.example.noplastic.Fragments;

import java.io.Serializable;

public class Plastico implements Serializable{
    String nombrePL;
    String fecPL;
    String origenPL;
    String ubicacionPL;
    String descripcionPL;
    String categoriaPL;


    public Plastico(String _nombre, String _fec, String _origen, String _ubi, String _desc, String _cat){
        nombrePL = _nombre;
        fecPL = _fec;
        origenPL = _origen;
        ubicacionPL = _ubi;
        descripcionPL = _desc;
        categoriaPL = _cat;
    }

    public String getNombrePL() {
        return nombrePL;
    }

    public String getFecPL() {
        return fecPL;
    }

    public String getOrigenPL() {
        return origenPL;
    }

    public String getUbicacionPL() {
        return ubicacionPL;
    }

    public String getDescripcionPL() { return descripcionPL;}

    public String getCategoriaPL() {
        return categoriaPL;
    }

}