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
import java.util.Date;

/**
 *
 * @author jonnhi
 */
public interface ServiciosMonitoria {

    public abstract Monitor consultarMonitor(Integer codigo) throws ExcepcionServiciosMonitoria;

    /**
     *
     * @param admin
     * @throws ExcepcionServiciosMonitoria
     */
    public abstract void registrarAdministrador(Administrador admin) throws ExcepcionServiciosMonitoria;

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
     * @return @throws ExcepcionServiciosMonitoria
     */
    public abstract List<Franja> consultarFranjas() throws ExcepcionServiciosMonitoria;

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
    public abstract void registrarMonitoria(Monitoria mo, Monitor m)
            throws ExcepcionServiciosMonitoria;

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

}
