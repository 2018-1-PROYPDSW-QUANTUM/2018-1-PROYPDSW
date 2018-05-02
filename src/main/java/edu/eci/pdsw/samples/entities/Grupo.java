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
   private long id;
   private Curso curso;
   private Semestre semestre; 
   private String periodoAcademico;
   private int numero;
   private Profesor profesor;
   private Monitor monitor;
   private List<Estudiante> estudiantes;

   
   public Grupo(){
   }
   
   
   public Grupo(long id, Curso curso,Semestre semestre, String periodoAcademico,int numero,Profesor profesor,Monitor monitor,int creditos){
       this.id=id;
       this.curso=curso;
       this.semestre=semestre;
       this.periodoAcademico=periodoAcademico;
       this.numero=numero;
       this.profesor=profesor;
       this.monitor=monitor;
   }
   
   public void  agregarEstudiante(Estudiante e){
       estudiantes.add(e);
   }
   
   public void eliminarEstudiante(Estudiante e){
       estudiantes.remove(e);
   }
   
   public long getIdentificador(){
       return this.id;
   }
   public Curso getCurso(){
       return curso;
   }
   
   public Semestre getSemestre(){
       return semestre;
   }
   
   public String getPeriodoAcademico(){
       return periodoAcademico;
   }
   
   public int getNumero(){
       return numero;
   }
   
   public int getProfesor(){
       return profesor.getId();
   }
   
   public int getMonitor(){
       return monitor.getCodigo();
   }
   
   
   public void setCurso(Curso curso){
       this.curso=curso;
   }
   
   public void setSemestre(Semestre semestre){
       this.semestre=semestre;
   }
   
   public void setPeriodoAcademico(String periodoAcademico){
       this.periodoAcademico=periodoAcademico;
   }
   public void setNumero(int numero){
       this.numero=numero;
   }
   public void setProfesor(Profesor profesor){
       this.profesor=profesor;
   }
   public void setMonitor(Monitor monitor){
       this.monitor=monitor;
   }
   
}
