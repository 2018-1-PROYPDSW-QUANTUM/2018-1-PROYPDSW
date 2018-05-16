/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.entities;

import java.util.List;

/**
 *
 * @author diego
 */
public class Grupo {

    private Integer id;
    private Semestre semestre;
    private Curso curso;
    private int numero;
    private List<Franja> franjas;
    private Monitor monitor;
    private Profesor profesor;

    public Grupo() {
    }

    public Grupo(Integer id, Semestre semestre, Curso curso, int numero, List<Franja> franjas) {
        this.id = id;
        this.semestre = semestre;
        this.curso = curso;
        this.numero = numero;
        this.franjas = franjas;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Semestre getSemestre() {
        return semestre;
    }

    public void setSemestre(Semestre semestre) {
        this.semestre = semestre;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public List<Franja> getFranjas() {
        return franjas;
    }

    public void setFranjas(List<Franja> franjas) {
        this.franjas = franjas;
    }
    
    public Monitor getMonitor() {
        return monitor;
    }

    public void setMoniotor(Monitor monitor) {
        this.monitor = monitor;
    }
    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    @Override
    public String toString() {
        return "Grupo {" + "Id=" + id + ", Semestre=" + semestre + ", Curso="
                + curso + ", Numero=" + numero + ", Franjas=" + franjas + '}';
    }

}
