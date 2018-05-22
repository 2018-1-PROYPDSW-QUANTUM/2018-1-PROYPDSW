/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.entities;

import java.time.LocalTime;
import java.util.Date;
import java.util.List;

/**
 *
 * @author jonnhi
 */
public class Monitoria {

    private Integer id;
    private Date fecha;
    private LocalTime horaInicio;
    private LocalTime horaFin;
    private String ip;
    private String observaciones;
    private List<Asistente> asistentes;
    
    public List<Asistente> getAsistentes() {
        return asistentes;
    }

    public void setAsistentes(List<Asistente> asistentes) {
        this.asistentes = asistentes;
    }

    public Monitoria() {
    }

    public Monitoria(Integer id, Date fecha, LocalTime horaInicio, LocalTime horaFin, String ip, String observaciones,List<Asistente> asistentes) {
        this.id = id;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.ip = ip;
        this.observaciones = observaciones;
        this.asistentes=asistentes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
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

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    

    @Override
    public String toString() {
        return "Monitoria {" + "Id=" + id + ", Fecha=" + fecha + ", Hora inicio=" + horaInicio
                + ", Hora fin=" + horaFin + ", Ip=" + ip + ", Observaciones=" + observaciones + '}';
    }

}
