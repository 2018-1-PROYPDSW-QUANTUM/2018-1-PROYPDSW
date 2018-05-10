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
    
    /**
     *
     * @param materiaProfesor
     * @return
     */
    default List<Grupo> consultarGruposXMateria(String materiaProfesor){
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
}
