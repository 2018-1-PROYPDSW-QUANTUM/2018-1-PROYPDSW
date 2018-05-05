/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.entities;

/**
 *
 * @author diego
 */
public class Tema {

    private Integer id;
    private Curso cursoNemonico;
    private String nombre;
    private String descripcion;

    public Tema() {
    }

    public Tema(Integer id, Curso cursoNeumonico, String nombre, String descripcion) {
        this.id = id;
        this.cursoNemonico = cursoNeumonico;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Curso getCursoNemonico() {
        return cursoNemonico;
    }

    public void setCursoNemonico(Curso cursoNemonico) {
        this.cursoNemonico = cursoNemonico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
