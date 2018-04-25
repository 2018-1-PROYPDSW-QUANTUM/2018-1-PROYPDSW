/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.persistence.mybatis.mappers;

import edu.eci.pdsw.samples.entities.Grupo;
import java.time.Year;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 *
 * @author diego
 */
public interface GrupoMapper {
    
    public Grupo ConsultarGrupo(@Param("year")Year year,@Param("peridoAcad")String periodoAcademico,@Param("cursoNeum")String cursoNeumonico);
    public void AgregarGrupo(@Param("yea")Year year,@Param("periodoAca")String periodoAcademico,@Param("cursoNeu")String cursoNeumonico,@Param("num")int numero,@Param("Profesorcod")int profesorCodigo,@Param("monotCod")int codigo);
    public List<Grupo> ConsultarGrupos();
    
}
