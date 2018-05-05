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
    private int creditosAcademicos;
    private int horasMonitoria;
    private List<Grupo> grupos;
    private List<Tema> temas;

    public Curso() {
    }

    public Curso(String nemonico, String nombre, int creditosAcademicos, int horasMonitoria, List<Grupo> grupos, List<Tema> temas) {
        this.nombre = nombre;
        this.nemonico = nemonico;
        this.creditosAcademicos = creditosAcademicos;
        this.horasMonitoria = horasMonitoria;
        this.grupos = grupos;
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

    public int getCreditosAcademicos() {
        return creditosAcademicos;
    }

    public void setCreditosAcademicos(int creditosAcademicos) {
        this.creditosAcademicos = creditosAcademicos;
    }

    public int getHorasMonitoria() {
        return horasMonitoria;
    }

    public void setHorasMonitoria(int horasMonitoria) {
        this.horasMonitoria = horasMonitoria;
    }

    public List<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(List<Grupo> grupos) {
        this.grupos = grupos;
    }

    public List<Tema> getTemas() {
        return temas;
    }

    public void setTemas(List<Tema> temas) {
        this.temas = temas;
    }

}
