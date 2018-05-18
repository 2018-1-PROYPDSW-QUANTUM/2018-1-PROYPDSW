/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.managedbean;

import edu.eci.pdsw.samples.entities.Administrador;
import edu.eci.pdsw.samples.entities.Curso;
import edu.eci.pdsw.samples.entities.Monitor;
import edu.eci.pdsw.samples.entities.Profesor;
import edu.eci.pdsw.samples.entities.Semestre;
import edu.eci.pdsw.samples.services.ExcepcionServiciosMonitoria;
import edu.eci.pdsw.samples.services.ServiciosMonitoria;
import edu.eci.pdsw.samples.services.ServiciosMonitoriasFactory;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author 2105700
 */

@ManagedBean(name = "administradorBean")
@SessionScoped
public class AdministradorBean {
    
    private ServiciosMonitoria sm = ServiciosMonitoriasFactory.getInstance().getMonitoriasServices();
    
    //Atributos Profesor
    private Integer codigoProfesor;
    private String nombreProfesor;
    private String apellidoProfesor;
    private String celularProfesor;
    private String correoProfesor;
    private String claveProfesor;
    private Profesor profesorRegistrado;

    //Atributos curso
    private String nemonicoCurso;
    private String nombreCurso;
    private int creditosCurso;
    private double horasMonitoriaCurso;    
    private Curso cursoRegistrado;
    
    //Atributos semestre
    private Integer idSemestre;
    private Integer yearsSemestre;
    private String periodoAcademicoSemestre;
    private Date fechaInicioSemestre;
    private Date fechaFinSemestre;
    private Administrador adminSemestre;
    private Semestre semestreRegistrado;
    
    //Atributos monitor
    private Integer codigoMonitor;
    private String semestreIngresoMonitor;
    private String programaAcademicoMonitor;
    private String nombreMonitor;
    private String apellidoMonitor;
    private String celularMonitor;
    private String correoMonitor;
    private String claveMonitor;
    private Monitor monitorRegistrado;
    
    public AdministradorBean() {
    }    
 
    public void registrarProfesor() throws ExcepcionServiciosMonitoria{
        profesorRegistrado = new Profesor();
        profesorRegistrado.setCodigo(codigoProfesor);
        profesorRegistrado.setNombre(nombreProfesor);
        profesorRegistrado.setApellido(apellidoProfesor);
        profesorRegistrado.setCelular(celularProfesor);
        profesorRegistrado.setCorreo(correoProfesor);
        profesorRegistrado.setClave(claveProfesor);
        sm.registrarProfesor(profesorRegistrado);
    }
    
    public void registrarCurso() throws ExcepcionServiciosMonitoria{
        cursoRegistrado = new Curso();
        cursoRegistrado.setNemonico(nemonicoCurso);
        cursoRegistrado.setNombre(nombreCurso);
        cursoRegistrado.setCreditos(creditosCurso);
        cursoRegistrado.setHorasMonitoria(horasMonitoriaCurso);
        sm.registrarCurso(cursoRegistrado);
    }
    
    public void registrarSemestre() throws ExcepcionServiciosMonitoria{
        semestreRegistrado = new Semestre();
        semestreRegistrado.setId(idSemestre);
        semestreRegistrado.setYears(yearsSemestre);
        semestreRegistrado.setPeriodoAcademico(periodoAcademicoSemestre);
        semestreRegistrado.setFechaInicio(fechaInicioSemestre);
        semestreRegistrado.setFechaFin(fechaFinSemestre);
        semestreRegistrado.setAdmin(adminSemestre);
        sm.registrarSemestre(semestreRegistrado);
    }
    
    public void registrarMonitor() throws ExcepcionServiciosMonitoria{
        monitorRegistrado = new Monitor();
        monitorRegistrado.setCodigo(codigoMonitor);
        monitorRegistrado.setSemestreIngreso(semestreIngresoMonitor);
        monitorRegistrado.setProgramaAcademico(programaAcademicoMonitor);
        monitorRegistrado.setNombre(nombreMonitor);
        monitorRegistrado.setApellido(apellidoMonitor);
        monitorRegistrado.setCelular(celularMonitor);
        monitorRegistrado.setCorreo(correoMonitor);
        monitorRegistrado.setClave(claveMonitor);
        sm.registrarMonitor(monitorRegistrado);
    }
    
    public ServiciosMonitoria getSm() {
        return sm;
    }

    public void setSm(ServiciosMonitoria sm) {
        this.sm = sm;
    }    

    public Semestre getSemestreRegistrado() {
        return semestreRegistrado;
    }

    public void setSemestreRegistrado(Semestre semestreRegistrado) {
        this.semestreRegistrado = semestreRegistrado;
    }

    public Integer getCodigoMonitor() {
        return codigoMonitor;
    }

    public void setCodigoMonitor(Integer codigoMonitor) {
        this.codigoMonitor = codigoMonitor;
    }

    public String getSemestreIngresoMonitor() {
        return semestreIngresoMonitor;
    }

    public void setSemestreIngresoMonitor(String semestreIngresoMonitor) {
        this.semestreIngresoMonitor = semestreIngresoMonitor;
    }

    public String getProgramaAcademicoMonitor() {
        return programaAcademicoMonitor;
    }

    public void setProgramaAcademicoMonitor(String programaAcademicoMonitor) {
        this.programaAcademicoMonitor = programaAcademicoMonitor;
    }

    public String getNombreMonitor() {
        return nombreMonitor;
    }

    public void setNombreMonitor(String nombreMonitor) {
        this.nombreMonitor = nombreMonitor;
    }

    public String getApellidoMonitor() {
        return apellidoMonitor;
    }

    public void setApellidoMonitor(String apellidoMonitor) {
        this.apellidoMonitor = apellidoMonitor;
    }

    public String getCelularMonitor() {
        return celularMonitor;
    }

    public void setCelularMonitor(String celularMonitor) {
        this.celularMonitor = celularMonitor;
    }

    public String getCorreoMonitor() {
        return correoMonitor;
    }

    public void setCorreoMonitor(String correoMonitor) {
        this.correoMonitor = correoMonitor;
    }

    public String getClaveMonitor() {
        return claveMonitor;
    }

    public void setClaveMonitor(String claveMonitor) {
        this.claveMonitor = claveMonitor;
    }

    public Monitor getMonitorRegistrado() {
        return monitorRegistrado;
    }

    public void setMonitorRegistrado(Monitor monitorRegistrador) {
        this.monitorRegistrado = monitorRegistrador;
    }

    public Curso getCursoRegistrado() {
        return cursoRegistrado;
    }

    public void setCursoRegistrado(Curso cursoRegistrado) {
        this.cursoRegistrado = cursoRegistrado;
    }

    public Integer getIdSemestre() {
        return idSemestre;
    }

    public void setIdSemestre(Integer idSemestre) {
        this.idSemestre = idSemestre;
    }

    public Integer getYearsSemestre() {
        return yearsSemestre;
    }

    public void setYearsSemestre(Integer yearsSemestre) {
        this.yearsSemestre = yearsSemestre;
    }

    public String getPeriodoAcademicoSemestre() {
        return periodoAcademicoSemestre;
    }

    public void setPeriodoAcademicoSemestre(String periodoAcademicoSemestre) {
        this.periodoAcademicoSemestre = periodoAcademicoSemestre;
    }

    public Date getFechaInicioSemestre() {
        return fechaInicioSemestre;
    }

    public void setFechaInicioSemestre(Date fechaInicioSemestre) {
        this.fechaInicioSemestre = fechaInicioSemestre;
    }

    public Date getFechaFinSemestre() {
        return fechaFinSemestre;
    }

    public void setFechaFinSemestre(Date fechaFinSemestre) {
        this.fechaFinSemestre = fechaFinSemestre;
    }

    public Administrador getAdminSemestre() {
        return adminSemestre;
    }

    public void setAdminSemestre(Administrador adminSemestre) {
        this.adminSemestre = adminSemestre;
    }
    
    public Integer getCodigoProfesor() {
        return codigoProfesor;
    }

    public void setCodigoProfesor(Integer codigoProfesor) {
        this.codigoProfesor = codigoProfesor;
    }

    public String getNombreProfesor() {
        return nombreProfesor;
    }

    public void setNombreProfesor(String nombreProfesor) {
        this.nombreProfesor = nombreProfesor;
    }

    public String getApellidoProfesor() {
        return apellidoProfesor;
    }

    public void setApellidoProfesor(String apellidoProfesor) {
        this.apellidoProfesor = apellidoProfesor;
    }

    public String getCelularProfesor() {
        return celularProfesor;
    }

    public void setCelularProfesor(String celularProfesor) {
        this.celularProfesor = celularProfesor;
    }

    public String getCorreoProfesor() {
        return correoProfesor;
    }

    public void setCorreoProfesor(String correoProfesor) {
        this.correoProfesor = correoProfesor;
    }

    public String getClaveProfesor() {
        return claveProfesor;
    }

    public void setClaveProfesor(String claveProfesor) {
        this.claveProfesor = claveProfesor;
    }

    public String getNemonicoCurso() {
        return nemonicoCurso;
    }

    public void setNemonicoCurso(String nemonicoCurso) {
        this.nemonicoCurso = nemonicoCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCreditosCurso() {
        return creditosCurso;
    }

    public void setCreditosCurso(int creditosCurso) {
        this.creditosCurso = creditosCurso;
    }

    public double getHorasMonitoriaCurso() {
        return horasMonitoriaCurso;
    }

    public void setHorasMonitoriaCurso(double horasMonitoriaCurso) {
        this.horasMonitoriaCurso = horasMonitoriaCurso;
    }

    
    
    public Profesor getProfesorRegistrado() {
        return profesorRegistrado;
    }

    public void setProfesorRegistrado(Profesor profesorRegistrado) {
        this.profesorRegistrado = profesorRegistrado;
    }   
}
