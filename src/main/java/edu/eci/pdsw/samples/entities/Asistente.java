/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.entities;

import java.util.List;

/**
 *
 * @author jonnhi
 */
public class Asistente {

    private Monitoria monitoria;
    private Estudiante estudiante;
    private List<Tema> temas;

    public Asistente() {

    }

    public Asistente(Monitoria monitoria, Estudiante estudiante, List<Tema> temas) {
        this.monitoria = monitoria;
        this.estudiante = estudiante;
        this.temas = temas;
    }

    public Monitoria getMonitoria() {
        return monitoria;
    }

    public void setMonitoria(Monitoria monitoria) {
        this.monitoria = monitoria;
    }

    public List<Tema> getTemas() {
        return temas;
    }

    public void setTemas(List<Tema> temas) {
        this.temas = temas;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
    
    @Override
    public String toString() {
        return "Asistentes {" + "Monitoria=" + monitoria + ", Estudiante=" + estudiante + ", Temas=" + temas + '}';
    }

}
