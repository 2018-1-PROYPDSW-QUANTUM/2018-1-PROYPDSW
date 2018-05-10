/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.managedbean;

import edu.eci.pdsw.samples.entities.Asistente;
import edu.eci.pdsw.samples.entities.Curso;
import edu.eci.pdsw.samples.entities.Grupo;
import edu.eci.pdsw.samples.entities.Monitoria;
import edu.eci.pdsw.samples.entities.Profesor;
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

@ManagedBean(name = "monitoriaProfesor")
@SessionScoped
public class MonitoriaProfesorBean {

    private ServiciosMonitoria sm = ServiciosMonitoriasFactory.getInstance().getMonitoriasServices();
    private int codigoProfesor;
    private String materiaProfesor;
    private int grupo;
       
    public MonitoriaProfesorBean() {
        codigoProfesor = 997;
        materiaProfesor = "PIMO";
        grupo = 1;
    }    

    public ServiciosMonitoria getSm() {
        return sm;
    }

    public void setSm(ServiciosMonitoria sm) {
        this.sm = sm;
    }

    public List<Curso> getProfesorMonitoria() throws ExcepcionServiciosMonitoria {
        return sm.consultarMateriasXCodigoProfesor(codigoProfesor);
    }
    
    public List<Grupo> getGruposProfesorMateria() throws ExcepcionServiciosMonitoria{
        return sm.consultarGruposXMateriaProfesor(materiaProfesor);
    }
    
    public List<Asistente> getInfoMonitoria() throws ExcepcionServiciosMonitoria{
        return sm.consultarMonitoriaXGrupo(grupo, materiaProfesor);
    }
}
