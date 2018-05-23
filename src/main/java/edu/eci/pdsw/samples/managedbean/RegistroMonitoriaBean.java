/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.managedbean;

import edu.eci.pdsw.samples.entities.Asistente;
import edu.eci.pdsw.samples.entities.Curso;
import edu.eci.pdsw.samples.entities.Estudiante;
import edu.eci.pdsw.samples.entities.Franja;
import edu.eci.pdsw.samples.entities.Grupo;
import edu.eci.pdsw.samples.entities.Monitoria;
import edu.eci.pdsw.samples.entities.Profesor;
import edu.eci.pdsw.samples.entities.Tema;
import edu.eci.pdsw.samples.persistence.PersistenceException;
import edu.eci.pdsw.samples.services.ExcepcionServiciosMonitoria;
import edu.eci.pdsw.samples.services.ServiciosMonitoria;
import edu.eci.pdsw.samples.services.ServiciosMonitoriasFactory;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;
import edu.eci.pdsw.samples.managedbean.ShiroLoginBean;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author camil
 */
@ManagedBean(name = "registrarMonitoria")
@SessionScoped

public class RegistroMonitoriaBean {

    @ManagedProperty("#{loginBean}")
    private ShiroLoginBean shiro;
    private Asistente asistente;
    private ServiciosMonitoria sm = ServiciosMonitoriasFactory.getInstance().getMonitoriasServices();
    private Monitoria nuevaMonitoria;
    private String grupo;
    private Franja franjaMonitoria;
    private int estudianteMonitoria;
    private Monitoria monitoriaSeleccionada;
    private List<Monitoria> cMonitorias;
    private Integer monitorCodigo;
    private String curso;
    private String observaciones;
    private Monitoria selectMonitoria;
    private List<Asistente> asistenteMonitoria;
    private List<Estudiante> estudiantes;
    private List<Tema> temas;
    private Tema temasAsistente;
    private List<Profesor> profesores;
    private Estudiante estudian;
    private Tema tema;
    private Profesor profesor;
    private Integer numId;
    private Integer grupId;
    private List<Asistente> asistentes;
    private Curso cursoSeleccionado;

    public RegistroMonitoriaBean() throws PersistenceException, ExcepcionServiciosMonitoria {
        nuevaMonitoria = new Monitoria();
    }

    public String getUser() {
        return shiro.getUsername();

    }

    public void setShiro(ShiroLoginBean si) {
        shiro = si;
        try {
            cMonitorias = sm.consultarMonitorias();
            temas = sm.consultarTemas();
        } catch (ExcepcionServiciosMonitoria ex) {
            Logger.getLogger(RegistroMonitoriaBean.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public List<Curso> getConsultarMaterias() throws ExcepcionServiciosMonitoria{
        return sm.consultarCursos();
    }
    
    public List<Franja> getConsultarFranjas() throws ExcepcionServiciosMonitoria{
        return sm.consultarFranjas();
    }
    
    public ShiroLoginBean getShiro() {
        return shiro;
    }

    public void setNuevaMonitoria() throws ExcepcionServiciosMonitoria {
        System.out.println("------------------------------------------------------");
        nuevaMonitoria.setHoraFin(LocalTime.now());
        nuevaMonitoria.setObservaciones(observaciones);
        sm.registrarMonitoria(nuevaMonitoria, sm.consultarMonitor(monitorCodigo));
        for (Asistente i : asistentes) {
            sm.registrarAsesoria(i.getMonitoria().getId(), i.getEstudiante().getCodigo(), i.getTema().getId());
        }
    }

    public void comenzarMonitoria() throws ExcepcionServiciosMonitoria {
        nuevaMonitoria = new Monitoria(sm.consultarMonitorias().size() + 1, new Date(), LocalTime.now(), null, shiro.getIp(), observaciones, new ArrayList<>());
        asistentes = nuevaMonitoria.getAsistentes();
    }

    public void agregarAsistente() throws ExcepcionServiciosMonitoria {
        asistente = new Asistente(nuevaMonitoria, sm.consultarEstudiante(estudianteMonitoria), temasAsistente);
        asistentes.add(asistente);
        nuevaMonitoria.setAsistentes(asistentes);
    }

    public Tema getTemaAsistente() {
        return this.temasAsistente;
    }

    public void setTemaAsistente(Tema temasAsistente) {
        this.temasAsistente = temasAsistente;
    }
    
    public void setAsistente(Asistente asistente){
        this.asistente=asistente;        
    }
    
    public Asistente getAsistente(){
        return this.asistente;        
    }
    
    public void eliminarAsistente(){
        asistentes.remove(asistente);
        nuevaMonitoria.setAsistentes(asistentes);
    }

    public List<Asistente> getAsistentes() {
        return this.asistentes;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public Curso getCursoSeleccionado() {
        return cursoSeleccionado;
    }

    public void setCursoSeleccionado(Curso cursoSeleccionado) {
        this.cursoSeleccionado = cursoSeleccionado;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Integer getMonitorCodigo() {
        System.out.println("QUe imprime + monitor" + monitorCodigo);

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
        cMonitorias = sm.consultarMonitorias();
        return cMonitorias;
    }

    public void setCMonitorias() throws ExcepcionServiciosMonitoria {
        this.cMonitorias = sm.consultarMonitorias();
    }

    public void registrarNuevaMonitoria(Monitoria nuevaMonitoria) throws PersistenceException, ExcepcionServiciosMonitoria {

    }

    public Integer getIdGrupo() {
        System.out.println("QUe imprime +grupo" + grupId);
        return grupId;
    }

    public void setIdGrupo(Integer id) {
        grupId = id;

    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
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

    public List<Asistente> getAsistenteMonitoria() throws ExcepcionServiciosMonitoria {

        return sm.consultarAsistentes();

    }

    //Para seleccionar monitoria para agregar las asesorias
    public Monitoria getSelectMonitoria() {
        return selectMonitoria;

    }

    public void setSelectMonitoria(Monitoria selectMonitoria) {

        this.selectMonitoria = selectMonitoria;

    }

    public List<Estudiante> getEstudiantes() throws ExcepcionServiciosMonitoria {
        estudiantes = sm.consultarEstudiantes();
        /**
         * for (int i =0; i<estudiantes.size();i++){ Estudiante u=
         * estudiantes.get(i); System.out.println("Que imprime
         * :"+u.getCodigo()); }
         */
        return estudiantes;

    }

    public Estudiante getEstudiant() {
        System.out.println("ESTUDIANTE ES: " + estudian);
        return estudian;
    }

    public Integer getIdEstudiante() {
        System.out.println("numero ESTUDIANTE ES: " + numId);
        return numId;
    }

    public void setIdEstudiante(Integer id) {
        numId = id;

    }

    public void setEstudiant(Estudiante estudiante) {
        System.out.println("Pasamos por aqui");
        this.estudian = estudiante;

    }

    public List<Tema> getTemas() throws ExcepcionServiciosMonitoria {
        temas = sm.consultarTemas();
        return temas;
    }

    public Tema getTema() throws ExcepcionServiciosMonitoria {
        return tema;
    }

    public void setTema(Tema tema) {
        this.tema = tema;
    }

    public List<Profesor> getProfesor() throws ExcepcionServiciosMonitoria {
        profesores = sm.consultarProfesores();
        return profesores;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
    //Asesoria

}
