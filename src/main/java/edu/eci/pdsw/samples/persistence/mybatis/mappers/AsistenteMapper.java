/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.persistence.mybatis.mappers;

import java.util.List;
import edu.eci.pdsw.samples.entities.Asistente;
import edu.eci.pdsw.samples.entities.Monitoria;
import org.apache.ibatis.annotations.Param;

/**
 *
 * @author jonnhi
 */
public interface AsistenteMapper {
    
   
    /**
     *
     * @param grupo
     * @param nemonico
     * @return
     */
    default List<Asistente> consultarMonitoriasXGrupo(int grupo, String nemonico){
        return consultarMonitoriasXGrupoGeneral(grupo, nemonico);
    }    
    
    /**
     *
     * @param grupo
     * @param nemonico
     * @return
     */
    public List<Asistente> consultarMonitoriasXGrupoGeneral(@Param("grupoMonitoria") int grupo,@Param("nemonicoMonitoria") String nemonico);    
    
    public List<Asistente> consultarAsistentes();
    
    public Asistente consultarAsistenteXMonitoria(@Param("miAsistente") Integer monitoriaId);
    
    public Asistente consultarAsistenteXEstudiante(@Param("ecAsistente") Integer estudianteCodigo);
    
    public List<Asistente> consultarAsistentesXMateria(@Param("neCurso") String curso);
    
    public void registrarAsistente(@Param("miAsistente") Integer monitoriaId, 
            @Param("ecAsistente") Integer estudianteCodigo, 
            @Param("tiAsistente") Integer temaId);
}
