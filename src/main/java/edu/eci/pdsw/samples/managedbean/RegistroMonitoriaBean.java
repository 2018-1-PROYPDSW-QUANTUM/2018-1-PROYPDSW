/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.managedbean;

import edu.eci.pdsw.samples.entities.Estudiante;
import edu.eci.pdsw.samples.entities.Franja;
import edu.eci.pdsw.samples.entities.Grupo;
import edu.eci.pdsw.samples.entities.Monitoria;
import edu.eci.pdsw.samples.persistence.PersistenceException;
import edu.eci.pdsw.samples.services.ExcepcionServiciosMonitoria;
import edu.eci.pdsw.samples.services.ServiciosMonitoria;
import edu.eci.pdsw.samples.services.ServiciosMonitoriasFactory;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author camil
 */

@ManagedBean(name = "registrarMonitoria")
@SessionScoped
public class RegistroMonitoriaBean {
    
    private ServiciosMonitoria sm = ServiciosMonitoriasFactory.getInstance().getMonitoriasServices();
    private final Monitoria nuevaMonitoria;
    private Grupo grupo;    
    private Franja franjaMonitoria;
    private Estudiante estudianteMonitoria;
    private Monitoria monitoriaSeleccionada;

    public RegistroMonitoriaBean() throws PersistenceException{
        estudianteMonitoria = new Estudiante();
        nuevaMonitoria = new Monitoria();
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

    public List<Monitoria>consultarMonitorias() throws ExcepcionServiciosMonitoria{
        return sm.consultarMonitorias();
    }
    
    public void registrarNuevaMonitoria(Monitoria nuevaMonitoria) throws PersistenceException, ExcepcionServiciosMonitoria {
        sm.registrarMonitoria(nuevaMonitoria.getId(), nuevaMonitoria.getFecha(), nuevaMonitoria.getHoraInicio(), nuevaMonitoria.getHoraFin(),
                nuevaMonitoria.getIp(), nuevaMonitoria.getObservaciones(), nuevaMonitoria.getMonitor().getCodigo());
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

    public Estudiante getEstudianteMonitoria() {
        return estudianteMonitoria;
    }

    public void setEstudianteMonitoria(Estudiante estudianteMonitoria) {
        this.estudianteMonitoria = estudianteMonitoria;
    }
    
}