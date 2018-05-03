/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.persistence.mybatis.mappers;

import edu.eci.pdsw.samples.entities.Franja;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 *
 * @author 2104784
 */
public interface FranjaMapper {
    public Franja ConsultarFranja(@Param("iden") long identificardor);
    public void AgregarFranja(@Param("id") long id, @Param("semestre")long semestreIdentificador,@Param("periodoAca")String periodoAcademico,@Param("cursoNeu")String cursoNeumonico,@Param("num")int numero,@Param("Profesorcod")int profesorCodigo,@Param("monotCod")int codigo);
    public List<Franja> ConsultarFranjas();
}
