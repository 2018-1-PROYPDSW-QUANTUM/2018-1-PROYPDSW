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

//nombre del curso, nemónico, créditos académicos, horas de monitoría aprobadas para el curso, temas asociados al curso
public class Curso {
    private String nombre;
    private String neumonico;
    private int creditosAcademicos;
    //private List<Franjas,HorasMonitoria> horasMonitoria;
    private List<Grupo> grupos;
    private List<Tema> temas;
    
    public Curso(){
    }
    
    public Curso(String nombre,String neumonico,int creditosAcademicos){
        this.nombre=nombre;
        this.neumonico=neumonico;
        this.creditosAcademicos=creditosAcademicos;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getNeumonico(){
        return neumonico;
    }
    
    public int getCreditosAcademicos(){
        return creditosAcademicos;
    }
    
    public void agregarGrupo(Grupo grupo){
        grupos.add(grupo);
    }
    
    public void elminarGrupo(Grupo grupo){
        grupos.remove(grupo);
    }
    
}
