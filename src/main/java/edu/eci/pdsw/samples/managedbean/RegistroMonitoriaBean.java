/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.managedbean;

import edu.eci.pdsw.samples.entities.Franja;
import edu.eci.pdsw.samples.entities.Grupo;
import edu.eci.pdsw.samples.entities.Monitoria;
import edu.eci.pdsw.samples.persistence.PersistenceException;
import edu.eci.pdsw.samples.services.ExcepcionServiciosMonitoria;
import edu.eci.pdsw.samples.services.ServiciosMonitoria;
import edu.eci.pdsw.samples.services.ServiciosMonitoriasFactory;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import java.util.List;
import javax.inject.Named;

/**
 *
 * @author camil
 */
@SessionScoped
@Named("registrarMonitoria")
public class RegistroMonitoriaBean implements Serializable {

    private ServiciosMonitoria sm = ServiciosMonitoriasFactory.getInstance().getMonitoriasServices();
    private final Monitoria nuevaMonitoria;
    private Grupo grupo;
    private Franja franjaMonitoria;
    private int estudianteMonitoria;
    private Monitoria monitoriaSeleccionada;
    private final List<Monitoria> cMonitorias;
    private Integer monitorCodigo;
    private String curso;
    private String observaciones;

    public RegistroMonitoriaBean() throws PersistenceException, ExcepcionServiciosMonitoria {
        cMonitorias = sm.consultarMonitorias();
        nuevaMonitoria = new Monitoria();
    }

    public void setNuevaMonitoria() throws ExcepcionServiciosMonitoria {
        sm.registrarMonitoria(null, null);
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Integer getMonitorCodigo() {
        return monitorCodigo;
    }

    public void setMonitorCodigo(Integer monitorCodigo) {
        this.monitorCodigo = monitorCodigo;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Monitoria getMonitoriaSeleccionada() {
        return monitoriaSeleccionada;
    }

    public void setMonitoriaSeleccionada(Monitoria monitoriaSeleccionada) {
        this.monitoriaSeleccionada = monitoriaSeleccionada;
    }

    public Monitoria getNuevaMonitoria() {
        return nuevaMonitoria;
    }

    public List<Monitoria> getCMonitorias() throws ExcepcionServiciosMonitoria {
        return cMonitorias;
    }

    public void registrarNuevaMonitoria(Monitoria nuevaMonitoria) throws PersistenceException, ExcepcionServiciosMonitoria {

    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public ServiciosMonitoria getSm() {
        return sm;
    }

    public void setSm(ServiciosMonitoria sm) {
        this.sm = sm;
    }

    public Franja getFranjaMonitoria() {
        return franjaMonitoria;
    }

    public void setFranjaMonitoria(Franja franjaMonitoria) {
        this.franjaMonitoria = franjaMonitoria;
    }

    public int getEstudianteMonitoria() {
        return estudianteMonitoria;
    }

    public void setEstudianteMonitoria(int estudianteMonitoria) {
        this.estudianteMonitoria = estudianteMonitoria;
    }

}
