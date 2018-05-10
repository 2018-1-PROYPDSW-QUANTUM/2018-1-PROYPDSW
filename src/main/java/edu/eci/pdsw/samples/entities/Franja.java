/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.entities;

import java.time.LocalTime;

/**
 *
 * @author DANIEL, jonnhi
 */
public class Franja {

    private Integer id;
    private String dia;
    private LocalTime horaInicio;
    private LocalTime horaFin;
    private Grupo grupo;

    public Franja() {
    }

    public Franja(Integer id, String dia, LocalTime horaInicio, LocalTime horaFin,Grupo grupo) {
        this.id = id;
        this.dia = dia;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalTime getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(LocalTime horaFin) {
        this.horaFin = horaFin;
    }
    
    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    @Override
    public String toString() {
        return "Franja {" + "Id=" + id + ", Dia=" + dia + ", Hora inicio=" + horaInicio + ", Hora fin=" + horaFin + '}';
    }

}
