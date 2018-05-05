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

    public Grupo consultarGrupo(@Param("iden") Integer identificardor);

    public List<Grupo> consultarGrupos();

    public void agregarGrupo(@Param("idGrupo") Integer id, 
            @Param("seGrupo") Integer semestreIdentificador, 
            @Param("cnGrupo") String cursoNemonico, 
            @Param("nuGrupo") int numero, 
            @Param("pcGrupo") Integer profesorCodigo, 
            @Param("mcGrupo") Integer codigo);
}
