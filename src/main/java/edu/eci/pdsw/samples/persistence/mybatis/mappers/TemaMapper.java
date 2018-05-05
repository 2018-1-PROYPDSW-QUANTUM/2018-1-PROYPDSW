/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.persistence.mybatis.mappers;

import edu.eci.pdsw.samples.entities.Tema;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 *
 * @author diego, jonnhi
 */
public interface TemaMapper {

    default Tema consultarTema(Integer id) {
        return consultarTemaGeneral(id).get(0);
    }

    default List<Tema> consultarTemas() {
        return consultarTemaGeneral(null);
    }

    public List<Tema> consultarTemaGeneral(@Param("idTema") Integer id);

    public void agregarTema(@Param("idTema") Integer id,
            @Param("cnTema") String cursoNemonico,
            @Param("nom") String nombre,
            @Param("descrip") String descripcion);

}
