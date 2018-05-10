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

    private List<Estudiante> estudiantes;
    private List<Grupo> grupos;

    public EstudianteCursa() {
    }

    public EstudianteCursa(List<Estudiante> estudiantes, List<Grupo> grupos) {
        this.estudiantes = estudiantes;
        this.grupos = grupos;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public List<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(List<Grupo> grupos) {
        this.grupos = grupos;
    }

    @Override
    public String toString() {
        return "Estudiante cursa {" + "Estudiantes=" + estudiantes + ", Grupos=" + grupos + '}';
    }

}
