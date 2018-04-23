/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.entities;

import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class Curso {
   private String NombreCurso;
   private String neumonico;
   private int creditos;
   //private  HoraMonitoria;
   private ArrayList<Tema> temas;
   
   public Curso(){
   }
   
   
   public Curso(String NombreCurso,String neumonico,int creditos){
       this.NombreCurso=NombreCurso;
       this.neumonico=neumonico;
       this.creditos=creditos;
   }
   
   public String getNombreCurso(){
       return NombreCurso;
   }
   
   public String getNeumonico(){
       return neumonico;
   }
   
   public int getCreditos(){
       return creditos;
   }
   
   public void setNombreCurso(String NombreCurso){
       this.NombreCurso=NombreCurso;
   }
   
   public void setNeumonico(String neumonico){
       this.neumonico=neumonico;
   }
   
   public void setCreditos(int creditos){
       this.creditos=creditos;
   }
}
