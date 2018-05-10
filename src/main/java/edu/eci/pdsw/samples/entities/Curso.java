/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.entities;

import java.util.List;

/**
 *
 * @author 2106146
 */
public class Curso {

    private String nemonico;
    private String nombre;
    private int creditos;
    private double horasMonitoria;
    private List<Tema> temas;

    public Curso() {
    }

    public Curso(String nemonico, String nombre, int creditos, double horasMonitoria, List<Tema> temas) {
        this.nemonico = nemonico;
        this.nombre = nombre;
        this.creditos = creditos;
        this.horasMonitoria = horasMonitoria;
        this.temas = temas;
    }

    public String getNemonico() {
        return nemonico;
    }

    public void setNemonico(String nemonico) {
        this.nemonico = nemonico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public double getHorasMonitoria() {
        return horasMonitoria;
    }

    public void setHorasMonitoria(double horasMonitoria) {
        this.horasMonitoria = horasMonitoria;
    }

    public List<Tema> getTemas() {
        return temas;
    }

    public void setTemas(List<Tema> temas) {
        this.temas = temas;
    }

    @Override
    public String toString() {
        return "Curso {" + "Nemonico=" + nemonico + ", Nombre=" + nombre + ", Creditos=" + creditos + 
                ", Horas monitoria=" + horasMonitoria + ", Temas=" + temas + '}';
    }

}
