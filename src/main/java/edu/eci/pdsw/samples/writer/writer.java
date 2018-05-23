/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.eci.pdsw.samples.writer;
import java.io.*;

/**
 *
 * @author cesar
 */
public class writer {
    
    public writer(){
    
    
    }
    
    public void escribir(String Codigo,String Clave, String Rol) throws IOException
    {
        FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter("/home/cesar/Escritorio/ProyectoQuantum/2018-1-PROYPDSW/src/main/resources/shiro.ini",true);
            pw = new PrintWriter(fichero);
            pw.println(Codigo+"="+Clave+","+Rol );            
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {

           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
    }
    
    
    
}
