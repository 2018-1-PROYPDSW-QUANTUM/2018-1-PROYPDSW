/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.persistence.mybatis.mappers;

import org.apache.ibatis.annotations.Param;

/**
 *
 * @author jonnhi
 */
public interface EstudianteMapper {
    
    public void registrarEstudiante(@Param("coEstudiante") Integer codigo);
}
