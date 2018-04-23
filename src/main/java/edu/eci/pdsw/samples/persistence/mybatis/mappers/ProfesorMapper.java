/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.persistence.mybatis.mappers;

import edu.eci.pdsw.samples.entities.Curso;
import edu.eci.pdsw.samples.entities.Profesor;

/**
 *
 * @author diego
 */
public interface ProfesorMapper {
    
    public void asignarCursoAProfesor(Curso curso ,Profesor profesor);
    
}
