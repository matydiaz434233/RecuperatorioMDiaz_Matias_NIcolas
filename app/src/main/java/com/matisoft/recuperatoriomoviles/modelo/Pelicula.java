package com.matisoft.recuperatoriomoviles.modelo;

import java.io.Serializable;

public class Pelicula implements Serializable {
    private String titulo;
    private double duracion;
    private String director;
    private int anio;

    public Pelicula(String titulo, double duracion, String director, int anio) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.director = director;
        this.anio = anio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
}
