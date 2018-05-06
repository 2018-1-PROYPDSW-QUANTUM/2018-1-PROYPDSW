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
    private Profesor profesor;
    private Monitor monitor;
    private List<Estudiante> estudiantes;
    private List<Franja> franjasMonitoria;

    public Grupo() {
    }

    public Grupo(Integer id, Semestre semestre, Curso curso, int numero, Profesor profesor, Monitor monitor, List<Estudiante> estudiantes, List<Franja> franjasMonitoria) {
        this.id = id;
        this.semestre = semestre;
        this.curso = curso;
        this.numero = numero;
        this.profesor = profesor;
        this.monitor = monitor;
        this.estudiantes = estudiantes;
        this.franjasMonitoria = franjasMonitoria;
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

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public List<Franja> getFranjasMonitoria() {
        return franjasMonitoria;
    }

    public void setFranjasMonitoria(List<Franja> franjasMonitoria) {
        this.franjasMonitoria = franjasMonitoria;
    }

}
