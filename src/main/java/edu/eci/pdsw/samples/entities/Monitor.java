/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.entities;

import java.util.List;

/**
 *
 * @author 2106146, jonnhi
 */
public class Monitor {

    private Integer codigo;
    private String semestreIngreso;
    private String programaAcademico;
    private String nombre;
    private String apellido;
    private String celular;
    private String correo;
    private String clave;
    private List<Grupo> gruposMonitor;

    public Monitor() {
    }

    public Monitor(Integer codigo, String semestreIngreso, String programaAcademico, String nombre, String apellido, String celular, String correo, String clave, List<Grupo> gruposMonitor) {
        this.codigo = codigo;
        this.semestreIngreso = semestreIngreso;
        this.programaAcademico = programaAcademico;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.correo = correo;
        this.clave = clave;
        this.gruposMonitor = gruposMonitor;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getSemestreIngreso() {
        return semestreIngreso;
    }

    public void setSemestreIngreso(String semestreIngreso) {
        this.semestreIngreso = semestreIngreso;
    }

    public String getProgramaAcademico() {
        return programaAcademico;
    }

    public void setProgramaAcademico(String programaAcademico) {
        this.programaAcademico = programaAcademico;
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

    public List<Grupo> getGruposMonitor() {
        return gruposMonitor;
    }

    public void setGruposMonitor(List<Grupo> gruposMonitor) {
        this.gruposMonitor = gruposMonitor;
    }
}
