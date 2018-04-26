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
public class Asistente {

    private Monitoria monitoria;
    private List<Tema> temas;
    private List<Estudiante> estudiantes;

    public Asistente(Monitoria monitoria, List<Tema> temas, List<Estudiante> estudiantes) {
        this.monitoria = monitoria;
        this.temas = temas;
        this.estudiantes = estudiantes;
    }

    public Monitoria getMonitoria() {
        return monitoria;
    }

    public void setMonitoria(Monitoria monitoria) {
        this.monitoria = monitoria;
    }

    public List<Tema> getTemas() {
        return temas;
    }

    public void setTemas(List<Tema> temas) {
        this.temas = temas;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
    
    
}
