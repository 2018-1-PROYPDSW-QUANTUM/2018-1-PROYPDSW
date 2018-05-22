/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.entities;

/**
 *
 * @author jonnhi
 */
public class Asistente {

    private Monitoria monitoria;
    private Estudiante estudiante;
    private Tema tema;

    public Asistente() {

    }

    public Asistente(Monitoria monitoria, Estudiante estudiante, Tema tema) {
        this.monitoria = monitoria;
        this.estudiante = estudiante;
        this.tema = tema;
    }

    public Monitoria getMonitoria() {
        return monitoria;
    }

    public void setMonitoria(Monitoria monitoria) {
        this.monitoria = monitoria;
    }

    public Tema getTema() {
        return tema;
    }

    public void setTema(Tema temas) {
        this.tema = temas;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    @Override
    public String toString() {
        return "Asistentes {" + "Monitoria=" + monitoria + ", Estudiante=" + estudiante + ", Temas=" + tema + '}';
    }

}
