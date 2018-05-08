/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.entities;

import java.util.List;

/**
 *
 * @author jonnhi
 */
public class EstudianteCursa {

    private List<Grupo> grupos;
    private List<Estudiante> estudiantes;

    public EstudianteCursa() {
    }
    
    public EstudianteCursa(List<Grupo> grupos, List<Estudiante> estudiantes) {
        this.grupos = grupos;
        this.estudiantes = estudiantes;
    }

    public List<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(List<Grupo> grupos) {
        this.grupos = grupos;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
    
    
}
