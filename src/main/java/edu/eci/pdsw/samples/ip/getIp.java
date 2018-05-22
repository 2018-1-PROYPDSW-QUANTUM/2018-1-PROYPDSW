/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.eci.pdsw.samples.ip;
import java.net.InetAddress;

/**
 *
 * @author cesar
 */
public class getIp {
    
    /**
    * @param args the command line arguments
    */
    
    public getIp(String[] args) throws Exception{
        main(args   );
        
    }
    
    public void main(String[] args)  throws Exception {
        // Aqui obtenemos la ip local de la maquina
        InetAddress address = InetAddress.getLocalHost();
        System.out.println("IP Local :"+address.getHostAddress());
 
        // Aqui obtenemos la ip de la web del programador
        String domain="www.lawebdelprogramador.com";
        InetAddress address2 = InetAddress.getByName(domain);
        byte IP[] = address2.getAddress();
        System.out.print("IP del dominio "+domain+" :");
        for (int index = 0; index < IP.length; index++)
        {
           if (index > 0)
                 System.out.print(".");
           System.out.print(((int)IP[index])& 0xff);
        }
    }
}
