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
    private int identificador;
    private String nombre;
    private String descripcion;
    private String cursoNeumonico;
    
    public Tema(){
    }
    
    public Tema(int identificador, String nombre,String descripcion, String cursoNeumonico){
        this.identificador=identificador;
        this.nombre=nombre;
        this.descripcion=descripcion;
        this.cursoNeumonico=cursoNeumonico;
    }
    
    public int getIdentificador(){
        return this.identificador;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getdescripcion(){
        return descripcion;
    }
    
    public String getCursoNeumonico(){
        return cursoNeumonico;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public void setDescripcion(String descripcion){
        this.descripcion=descripcion;
    }
    
    public void setCursoNeumonico(){
        this.cursoNeumonico=cursoNeumonico;
    }
}
