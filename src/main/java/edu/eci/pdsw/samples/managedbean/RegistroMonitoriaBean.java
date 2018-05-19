/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.managedbean;

import edu.eci.pdsw.samples.entities.Asistente;
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
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author camil
 */
@SessionScoped

@ManagedBean(name = "registrarMonitoria")
//@RequestScoped
public class RegistroMonitoriaBean {

    @ManagedProperty("#{loginBean}")
    private ShiroLoginBean shiro;

    private ServiciosMonitoria sm = ServiciosMonitoriasFactory.getInstance().getMonitoriasServices();
    private final Monitoria nuevaMonitoria;
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
    private List<Profesor> profesores;
    private Estudiante estudian;
    private Tema tema;
    private Profesor profesor;
    private Integer numId;
    private Integer grupId;

    public RegistroMonitoriaBean() throws PersistenceException, ExcepcionServiciosMonitoria {
        cMonitorias = sm.consultarMonitorias();
        //System.out.println("Usuario es: "+shiro.getUsername());
        //getUser();

        nuevaMonitoria = new Monitoria();
        //estudian=new Estudiante(32131);
    }

    public String getUser() {
        return shiro.getUsername();

    }

    public void setShiro(ShiroLoginBean si) {
        shiro = si;

    }

    public ShiroLoginBean getShiro() {
        return shiro;
    }

    public void setNuevaMonitoria() throws ExcepcionServiciosMonitoria {
        Monitoria monitoria = new Monitoria(sm.consultarMonitorias().size() + 1, new Date(), LocalTime.now(), LocalTime.now(), "xxx.xx.xx", observaciones);
        sm.registrarMonitoria(monitoria,sm.consultarMonitor(monitorCodigo));
    }

    public void setNuevaAsesoria(Integer m, Integer e, Integer t) throws ExcepcionServiciosMonitoria {
        System.out.println("Probadno");
        List<Tema> temas=new ArrayList<Tema>();
        //Creacion de objetos nulos para setear los valores necesarios
        Monitoria mon = new Monitoria(m,null,null, null, null,null);
        Estudiante est=new Estudiante(e);
        Tema tem=new Tema(t, null, null);
        temas.add(tem);
        //Monitoria monitoria, Estudiante estudiante, List<Tema> temas)
        Asistente asisten = new Asistente(mon, est, temas);
        
        
        sm.registrarAsesoria(m, e, t);

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
        cMonitorias = sm.consultarMonitorias();
        return cMonitorias;
    }

    public void setCMonitorias() throws ExcepcionServiciosMonitoria {
        this.cMonitorias = sm.consultarMonitorias();
    }

    public void registrarNuevaMonitoria(Monitoria nuevaMonitoria) throws PersistenceException, ExcepcionServiciosMonitoria {

    }

    public Integer getIdGrupo(){
        return grupId;
    }
    public void setIdGrupo(Integer id){
        grupId=id;
    
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
         * :"+u.getCodigo());
        }
         */
        return estudiantes;

    }

    public Estudiante getEstudiant() {
        System.out.println("ESTUDIANTE ES: " + estudian);
        return estudian;
    }
    
    public Integer getIdEstudiante(){
        System.out.println("numero ESTUDIANTE ES: " + numId);
        return numId;   
    }
    public void setIdEstudiante(Integer id){
        numId=id;
        
    
    }

    public void setEstudiant(Estudiante estudiante) {
        System.out.println("Pasamos por aqui");
        this.estudian = estudiante;

    }

    public List<Tema> getTema() throws ExcepcionServiciosMonitoria {
        temas = sm.consultarTemas();
        return temas;
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
