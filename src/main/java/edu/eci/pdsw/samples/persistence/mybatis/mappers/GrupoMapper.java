/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.persistence.mybatis.mappers;

import java.util.List;
import edu.eci.pdsw.samples.entities.Grupo;
import org.apache.ibatis.annotations.Param;

/**
 *
 * @author diego
 */
public interface GrupoMapper {

    /**
     *
     * @param codigo
     * @param grupoId
     */
    default void añadirMonitorAGrupo(Integer codigo, Integer grupoId) {
        añadirMonitorAGrupoGeneral(codigo, grupoId);
    }

    default void añadirProfesorAGrupo(Integer profesorId, Integer grupoId) {
        añadirProfesorAGrupoGeneral(profesorId, grupoId);
    }

    /**
     *
     * @param codigo
     * @param grupoId
     */
    public void añadirMonitorAGrupoGeneral(@Param("codigoMonitor") Integer codigo, @Param("grupoId") Integer grupoId);

    /**
     *
     * @return
     */
    default List<Grupo> consultarGruposSinProfesor() {
        return consultarGruposSinProfesorGeneral();
    }

    /**
     *
     * @param id
     * @return
     */
    default Grupo consultarGrupo(Integer id) {
        return consultarGrupoGeneral(id).get(0);
    }

    /**
     *
     * @return
     */
    default List<Grupo> consultarGrupos() {
        return consultarGrupoGeneral(null);
    }

    default List<Grupo> consultarGruposSinMonitor() {
        return consultarGruposSinMonitorGeneral();
    }

    /**
     *
<<<<<<< HEAD
     * @param materiaProfesor
     * @return
     */
    default List<Grupo> consultarGruposXMateria(String materiaProfesor) {
        return consultarGruposXMateriaGeneral(materiaProfesor);
    }

    /**
     *
     * @param materiaProfesor
     * @return
     */
    public List<Grupo> consultarGruposXMateriaGeneral(@Param("materiaProfesor") String materiaProfesor);

    /**
     *
=======
>>>>>>> Historia de uso: Consultar la informacion de las asesorias
     * @param id
     * @return
     */
    public List<Grupo> consultarGrupoGeneral(@Param("idGrupo") Integer id);

    /**
     *
     * @param id
     * @param semestreIdentificador
     * @param cursoNemonico
     * @param numero
     * @param profesorCodigo
     * @param codigo
     */
    public void registrarGrupo(@Param("idGrupo") Integer id,
            @Param("seGrupo") Integer semestreIdentificador,
            @Param("cnGrupo") String cursoNemonico,
            @Param("nuGrupo") int numero,
            @Param("pcGrupo") Integer profesorCodigo,
            @Param("mcGrupo") Integer codigo);

    /**
     *
     * @return
     */
    public List<Grupo> consultarGruposSinMonitorGeneral();

    /**
     *
     * @return
     */
    public List<Grupo> consultarGruposSinProfesorGeneral();

    /**
     *
     * @param profesorId
     * @param grupoId
     */
    public void añadirProfesorAGrupoGeneral(@Param("profesorId") Integer profesorId, @Param("grupoId") Integer grupoId);

    /**
     *
     * @param codigo
     * @return
     */
    default List<Grupo> consultarGrupoMonitor(Integer codigo) {
        return consultarGrupoMonitorGeneral(codigo);
    }

    /**
     *
     * @param codigo
     * @return
     */
    public List<Grupo> consultarGrupoMonitorGeneral(@Param("codigoMonitor") Integer codigo);
}
