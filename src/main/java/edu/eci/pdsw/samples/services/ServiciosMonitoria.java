/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.services;

import java.util.List;
import edu.eci.pdsw.samples.entities.Semestre;
import edu.eci.pdsw.samples.entities.Administrador;
import edu.eci.pdsw.samples.entities.Monitoria;
import edu.eci.pdsw.samples.entities.Asistente;
import edu.eci.pdsw.samples.entities.Curso;
import edu.eci.pdsw.samples.entities.Estudiante;
import edu.eci.pdsw.samples.entities.EstudianteCursa;
import edu.eci.pdsw.samples.entities.Franja;
import edu.eci.pdsw.samples.entities.Grupo;
import edu.eci.pdsw.samples.entities.Monitor;
import edu.eci.pdsw.samples.entities.Profesor;
import edu.eci.pdsw.samples.entities.Tema;

/**
 *
 * @author jonnhi
 */
public interface ServiciosMonitoria {

    public abstract void añadirProfesorAGrupo(Integer profesorId, Integer grupoId) throws ExcepcionServiciosMonitoria;

    /**
     *
     * @param codigo
     * @return
     * @throws ExcepcionServiciosMonitoria
     */
    public abstract Monitor consultarMonitor(Integer codigo) throws ExcepcionServiciosMonitoria;

    /**
     *
     * @return @throws ExcepcionServiciosMonitoria
     */
    public abstract List<Franja> consultarFranjas() throws ExcepcionServiciosMonitoria;

    /**
     *
     * @return @throws ExcepcionServiciosMonitoria
     */
    public abstract List<Grupo> consultarGruposSinProfesor() throws ExcepcionServiciosMonitoria;

    /**
     *
     * @param codigo
     * @param grupoId
     * @throws ExcepcionServiciosMonitoria
     */
    public abstract void anadirMonitorAGrupo(Integer codigo, Integer grupoId) throws ExcepcionServiciosMonitoria;

    /**
     *
     * @return @throws ExcepcionServiciosMonitoria
     */
    public abstract List<Grupo> consultarGruposSinMonitor() throws ExcepcionServiciosMonitoria;

    /**
     *
     * @param admin
     * @throws ExcepcionServiciosMonitoria
     */
    public abstract void registrarAdministrador(Administrador admin) throws ExcepcionServiciosMonitoria;

    /**
     *
     * @param codigoProfesor
     * @return
     * @throws ExcepcionServiciosMonitoria
     */
    public abstract List<Curso> consultarMateriasXCodigoProfesor(int codigoProfesor) throws ExcepcionServiciosMonitoria;

    /**
     *
     * @param grupo
     * @return
     * @throws ExcepcionServiciosMonitoria
     */
    public abstract List<Asistente> consultarAsistentesXGrupo(Grupo grupo) throws ExcepcionServiciosMonitoria;

    /**
     *
     * @param codigo
     * @return
     * @throws ExcepcionServiciosMonitoria
     */
    public abstract Administrador consultarAdministrador(Integer codigo) throws ExcepcionServiciosMonitoria;

    /**
     *
     * @return @throws ExcepcionServiciosMonitoria
     */
    public abstract List<Administrador> consultarAdministradores() throws ExcepcionServiciosMonitoria;

    /**
     *
     * @param materiaProfesor
     * @return
     * @throws edu.eci.pdsw.samples.services.ExcepcionServiciosMonitoria
     */
    public abstract List<Grupo> consultarGruposXMateriaProfesor(String materiaProfesor) throws ExcepcionServiciosMonitoria;

    /**
     *
     * @param m
     * @param e
     * @param t
     * @throws ExcepcionServiciosMonitoria
     */
    public abstract void registrarAsesoria(Integer m, Integer e, Integer t) throws ExcepcionServiciosMonitoria;

    /**
     *
     * @return @throws ExcepcionServiciosMonitoria
     */
    public abstract List<Asistente> consultarAsistentes() throws ExcepcionServiciosMonitoria;

    /**
     *
     * @param curso
     * @return
     * @throws ExcepcionServiciosMonitoria
     */
    public List<Asistente> consultarAsistentesXCurso(Curso curso) throws ExcepcionServiciosMonitoria;

    /**
     *
     * @return @throws ExcepcionServiciosMonitoria
     */
    public abstract List<Curso> consultarCursos() throws ExcepcionServiciosMonitoria;

    /**
     *
     * @return @throws ExcepcionServiciosMonitoria
     */
    public abstract List<EstudianteCursa> consultarEstudiantesCursan() throws ExcepcionServiciosMonitoria;

    /**
     *
     * @return @throws ExcepcionServiciosMonitoria
     */
    public abstract List<Estudiante> consultarEstudiantes() throws ExcepcionServiciosMonitoria;

    /**
     *
     * @param codigo
     * @return
     * @throws ExcepcionServiciosMonitoria
     */
    abstract Estudiante consultarEstudiante(Integer codigo) throws ExcepcionServiciosMonitoria;

    /**
     *
     * @param id
     * @return
     * @throws ExcepcionServiciosMonitoria
     */
    public abstract Grupo consultarGrupo(Integer id) throws ExcepcionServiciosMonitoria;

    /**
     *
     * @return @throws ExcepcionServiciosMonitoria
     */
    public abstract List<Grupo> consultarGrupos() throws ExcepcionServiciosMonitoria;

    /**
     *
     * @return @throws ExcepcionServiciosMonitoria
     */
    public abstract List<Monitor> consultarMonitores() throws ExcepcionServiciosMonitoria;

    /**
     *
     * @param mo
     * @param m
     * @throws ExcepcionServiciosMonitoria
     */
    public abstract void registrarMonitoria(Monitoria mo, Monitor m) throws ExcepcionServiciosMonitoria;

    /**
     *
     * @param cu
     * @throws ExcepcionServiciosMonitoria
     */
    public abstract void registrarCurso(Curso cu) throws ExcepcionServiciosMonitoria;

    /**
     *
     * @return @throws ExcepcionServiciosMonitoria
     */
    public abstract Monitoria consultarMonitoria() throws ExcepcionServiciosMonitoria;

    /**
     *
     * @return @throws ExcepcionServiciosMonitoria
     */
    public abstract List<Monitoria> consultarMonitorias() throws ExcepcionServiciosMonitoria;

    /**
     *
     * @param pro
     * @throws ExcepcionServiciosMonitoria
     */
    public abstract void registrarProfesor(Profesor pro) throws ExcepcionServiciosMonitoria;

    /**
     *
     * @param codigo
     * @return
     * @throws ExcepcionServiciosMonitoria
     */
    public abstract Profesor consultarProfesor(Integer codigo) throws ExcepcionServiciosMonitoria;

    /**
     *
     * @return @throws ExcepcionServiciosMonitoria
     */
    public abstract List<Profesor> consultarProfesores() throws ExcepcionServiciosMonitoria;

    /**
     *
     * @param sem
     * @throws ExcepcionServiciosMonitoria
     */
    public abstract void registrarSemestre(Semestre sem) throws ExcepcionServiciosMonitoria;

    /**
     *
     * @param year
     * @param periodo
     * @return
     * @throws ExcepcionServiciosMonitoria
     */
    public abstract Semestre consultarSemestre(Integer year, String periodo) throws ExcepcionServiciosMonitoria;

    /**
     *
     * @return @throws ExcepcionServiciosMonitoria
     */
    public abstract List<Semestre> consultarSemestres() throws ExcepcionServiciosMonitoria;

    /**
     *
     * @return @throws ExcepcionServiciosMonitoria
     */
    public abstract List<Tema> consultarTemas() throws ExcepcionServiciosMonitoria;

    /**
     *
     * @param m
     * @throws edu.eci.pdsw.samples.services.ExcepcionServiciosMonitoria
     */
    public abstract void registrarMonitor(Monitor m) throws ExcepcionServiciosMonitoria;

    /**
     *
     * @param codigo
     * @return
     * @throws ExcepcionServiciosMonitoria
     */
    public abstract List<Grupo> consultarGrupos(Integer codigo) throws ExcepcionServiciosMonitoria;

    /**
     *
     * @param franjaRegistrada
     * @throws edu.eci.pdsw.samples.services.ExcepcionServiciosMonitoria
     */
    public abstract void registrarFranja(Franja franjaRegistrada) throws ExcepcionServiciosMonitoria;

}
