/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.persistence.mybatis.mappers;

import edu.eci.pdsw.samples.entities.Grupo;
import edu.eci.pdsw.samples.entities.Profesor;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;
/**
 *
 * @author diego
 */
public interface ProfesorMapper {
    
    public Profesor ConsultarProfesor(@Param("idprof")long id);
    
    public void  AgregarProfesor(@Param("idpro") long id, @Param("nom") String nombre,@Param("apelli") String apellido,@Param("tel") String telefono, @Param("email") String correo);

    public Grupo ConsultarGrupoProfesor(@Param("yearG")Date year,@Param("gruPeriodo")String periodo,@Param("gruNeumonico")String neumonico );
    
    public void AsignarGrupoAProfesor(@Param("year")Date year,@Param("grupPeriodo")String periodo,@Param("grupNeumonico")String neumonico ,@Param("idpr") long profesor );
    

    public List<Profesor> ConsultarProfesores();
    
}
