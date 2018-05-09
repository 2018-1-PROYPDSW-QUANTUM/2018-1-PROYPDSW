/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.services.client;

import edu.eci.pdsw.samples.entities.Administrador;
import edu.eci.pdsw.samples.entities.Curso;
import edu.eci.pdsw.samples.entities.Profesor;
import edu.eci.pdsw.samples.entities.Semestre;
import edu.eci.pdsw.samples.services.ExcepcionServiciosMonitoria;
import edu.eci.pdsw.samples.services.ServiciosMonitoriasFactory;
import java.sql.Date;

/**
 *
 * @author jonnhi
 */
public class main {

    public static void main(String[] args) throws ExcepcionServiciosMonitoria {

        Administrador admin = new Administrador(2103258, "Jonathan", "Prieto", "3184448017", "jonathan.prieto@mail.escuelaing.edu.co", "clave01");
        Semestre sem = new Semestre(1, 2018, "1", Date.valueOf("2018-01-15"), Date.valueOf("2018-05-21"), admin);
        Profesor pro = new Profesor(1234, "Francisco", "Chaves", "3101112233", "francisco.chaves@mail.escuelaing.edu.co", "clave01", null);
        Curso cur = new Curso("PDSW", "Procesos de desarrollo de software", 4, 3, null, null);
//        ServiciosMonitoriasFactory.getInstance().getMonitoriasServices().registrarAdministrador(admin);
//        ServiciosMonitoriasFactory.getInstance().getMonitoriasServices().registrarSemestre(sem);
//        ServiciosMonitoriasFactory.getInstance().getMonitoriasServices().registrarProfesor(pro);
//        System.out.println(ServiciosMonitoriasFactory.getInstance().getMonitoriasServices().consultarProfesores());
    }
}
