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
public class Administrador {

    private Integer codigo;
    private String nombre;
    private String apellido;
    private String celular;
    private String correo;
    private String clave;

    public Administrador() {
    }

    public Administrador(Integer codigo, String nombre, String apellido, String celular, String correo, String clave) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.correo = correo;
        this.clave = clave;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    @Override
    public String toString() {
        return "Administrador {" + "Codigo=" + codigo + ", Nombre=" + nombre + ", Apellido=" + apellido + 
                ", Celular=" + celular + ", Correo=" + correo + ", Clave=" + clave + '}';
    }

}
