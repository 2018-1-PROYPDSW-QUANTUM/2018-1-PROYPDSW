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
public class Profesor {
    private long id;
    private String nombre;
    private String apellido;
    //private List[] grupos;
    private String correo;
    private String telefono;
    
    public Profesor(){
    }
    
    public Profesor(long id,String nombre,String apellido,String correo,String telefono){
        this.id=id;
        this.nombre=nombre;
        this.apellido=apellido;
        this.correo=correo;
        this.telefono=telefono;
    }
    
    public long getId(){
        return id;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public String getCorreo(){
        return correo;
    }
    
    public String getTelefono(){
        return telefono;
    } 
    
    public void setId(long id){
        this.id=id;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    
    public void setCorreo(String correo){
        this.correo=correo;
    }
    
    public void setTelefono(String telefono){
        this.telefono=telefono;
    }
    
}
