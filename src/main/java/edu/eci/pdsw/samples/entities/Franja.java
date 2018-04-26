/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.entities;

import java.util.Date;

/**
 *
 * @author DANIEL
 */
public class Franja {
   private String dia;
   private Date horaInicio;
   private Date horaFin;
   private int grupoYear;
   private char grupoPeriodoAcademico;
   private String grupoCursoNemonico;
   private int grupoNumero;

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public Date getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Date horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Date getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Date horaFin) {
        this.horaFin = horaFin;
    }

    public int getGrupoYear() {
        return grupoYear;
    }

    public void setGrupoYear(int grupoYear) {
        this.grupoYear = grupoYear;
    }

    public char getGrupoPeriodoAcademico() {
        return grupoPeriodoAcademico;
    }

    public void setGrupoPeriodoAcademico(char grupoPeriodoAcademico) {
        this.grupoPeriodoAcademico = grupoPeriodoAcademico;
    }

    public String getGrupoCursoNemonico() {
        return grupoCursoNemonico;
    }

    public void setGrupoCursoNemonico(String grupoCursoNemonico) {
        this.grupoCursoNemonico = grupoCursoNemonico;
    }

    public int getGrupoNumero() {
        return grupoNumero;
    }

    public void setGrupoNumero(int grupoNumero) {
        this.grupoNumero = grupoNumero;
    }
           
}
