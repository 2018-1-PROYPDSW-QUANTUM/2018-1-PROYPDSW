/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.entities;

import java.util.Date;

/**
 *
 * @author jonnhi
 */
public class Semestre {

    private Integer id;
    private Integer years;
    private String periodoAcademico;
    private Date fechaInicio;
    private Date fechaFin;
    private Administrador admin;

    public Semestre() {
    }

    public Semestre(Integer id, Integer years, String periodoAcademico, Date fechaInicio, Date fechaFin, Administrador admin) {
        this.id = id;
        this.years = years;
        this.periodoAcademico = periodoAcademico;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.admin = admin;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getYears() {
        return years;
    }

    public void setYears(Integer years) {
        this.years = years;
    }

    public String getPeriodoAcademico() {
        return periodoAcademico;
    }

    public void setPeriodoAcademico(String periodoAcademico) {
        this.periodoAcademico = periodoAcademico;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Administrador getAdmin() {
        return admin;
    }

    public void setAdmin(Administrador admin) {
        this.admin = admin;
    }

    @Override
    public String toString() {
        return "Semestre {" + "id=" + id + ", year=" + years + ", Periodo academico=" + periodoAcademico + 
                ", Fecha inicio=" + fechaInicio + ", Fecha fin=" + fechaFin + ", Administrador=" + admin + '}';
    }

}
