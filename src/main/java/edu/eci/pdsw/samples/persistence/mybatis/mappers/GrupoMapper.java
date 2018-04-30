/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.persistence.mybatis.mappers;

import edu.eci.pdsw.samples.entities.Grupo;
import edu.eci.pdsw.samples.entities.Semestre;
import java.time.Year;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 *
 * @author diego
 */
public interface GrupoMapper {
    
    public Grupo ConsultarGrupo(@Param("iden")long identificardor);
    public void AgregarGrupo(@Param("id")long id, @Param("semestre")long semestreIdentificador,@Param("periodoAca")String periodoAcademico,@Param("cursoNeu")String cursoNeumonico,@Param("num")int numero,@Param("Profesorcod")int profesorCodigo,@Param("monotCod")int codigo);
    public List<Grupo> ConsultarGrupos();

    public void AgregarGrupo(Semestre semestre, String periodoAcademico, String nemonico, int numero, int profesor, int monitor);
    
}
