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
 * @author diego
 */
public interface TemaMapper {
    
    public Tema ConsultarTema(@Param("nomb")String nombre);
    public void AgregarTema(@Param("nom")String nombre,@Param("descrip")String descripcion,@Param("cursNeu")String cursoNeumonico);
    public List<Tema> ConsultarTemas();
    
}
