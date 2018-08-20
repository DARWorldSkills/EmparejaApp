package com.aprendiz.ragp.emparejaapp;

public class Score {
    private String nombre;
    private int puntaje;
    private int dificultad;
    private int modo;

    public Score() {
    }

    public Score(String nombre, int puntaje, int dificultad, int modo) {
        this.nombre = nombre;
        this.puntaje = puntaje;
        this.dificultad = dificultad;
        this.modo = modo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public int getDificultad() {
        return dificultad;
    }

    public void setDificultad(int dificultad) {
        this.dificultad = dificultad;
    }

    public int getModo() {
        return modo;
    }

    public void setModo(int modo) {
        this.modo = modo;
    }
}
