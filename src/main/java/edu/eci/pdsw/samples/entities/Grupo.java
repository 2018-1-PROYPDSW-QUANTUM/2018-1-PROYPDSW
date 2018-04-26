/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.entities;


import java.time.Year;
import java.util.List;

/**
 *
 * @author diego
 */
public class Grupo {
   private String cursoNemonico;
   //private  HoraMonitoria;
   private Year year; 
   private String periodoAcademico;
   private int numero;
   private Profesor profesor;
   private Monitor monitor;
   //private List<estudiante> estudiantes;
   
   public Grupo(){
   }
   
   
   public Grupo(String neumonico,int creditos){
       this.cursoNemonico=neumonico;
   }
   
   
   public String getNemonico(){
       return cursoNemonico;
   }
   
   public Year getyear(){
       return year;
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
   
   
   public void setNemonico(String nemonico){
       this.cursoNemonico=nemonico;
   }
   
   public void setyear(Year year){
       this.year=year;
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
   
   
   /*public List<Tema> getTemas(){
       return temas;
   }*/
   
}
