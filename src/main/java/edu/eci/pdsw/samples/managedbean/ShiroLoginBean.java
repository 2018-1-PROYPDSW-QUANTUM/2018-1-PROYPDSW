/**
 * Very simple bean that authenticates the user via Apache Shiro, using JSF
 * @author Daniel Mascarenhas
 */
package edu.eci.pdsw.samples.managedbean;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import java.io.IOException;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

import java.net.InetAddress;
import java.net.UnknownHostException;

@ManagedBean(name = "loginBean")
@SessionScoped

public class ShiroLoginBean implements Serializable {
    private static final Logger log = LoggerFactory.getLogger(ShiroLoginBean.class);

    private String username;
    private String password;
    private Boolean rememberMe;
    private String dirrecionIp;

    

    public ShiroLoginBean() {

    }

    public Subject getSubject() {
        return SecurityUtils.getSubject();
    }
    
    /**
     * Try and authenticate the user
     */
    public void doLogin() throws UnknownHostException {
        Subject subject = SecurityUtils.getSubject();

        UsernamePasswordToken token = new UsernamePasswordToken(getUsername(), getPassword(), getRememberMe());
       
        setUsername(username);        
        setIp();
        try {
            subject.login(token);
            if (subject.hasRole("monitor")) {
                FacesContext.getCurrentInstance().getExternalContext().redirect("monitor/monitor.xhtml");
            }
            else if (subject.hasRole("profesor")) {
                FacesContext.getCurrentInstance().getExternalContext().redirect("profesor/profesor.xhtml");
            }
            else if (subject.hasRole("administrador")) {
                FacesContext.getCurrentInstance().getExternalContext().redirect("administracion/administracion.xhtml");
            }
            
            else {
                FacesContext.getCurrentInstance().getExternalContext().redirect("/unauthorized.xhtml");
            }
        }
        catch (UnknownAccountException ex) {
            facesError("Unknown account");
            log.error(ex.getMessage(), ex);
        }
        catch (IncorrectCredentialsException ex) {
            facesError("Wrong password");
            log.error(ex.getMessage(), ex);
        }
        catch (LockedAccountException ex) {
            facesError("Locked account");
            log.error(ex.getMessage(), ex);
        }
        catch (AuthenticationException ex) {
            facesError("Unknown error: " + ex.getMessage());
            log.error(ex.getMessage(), ex);
        }
        catch (IOException ex){
            facesError("Unknown error: " + ex.getMessage());
            log.error(ex.getMessage(), ex);
            
        }
        finally {
            token.clear();
        }
    }

    /**
     * Adds a new SEVERITY_ERROR FacesMessage for the ui
     * @param message Error Message
     */
    private void facesError(String message) {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, message, null));
    }

    public String getUsername() {
        System.out.println("es: "+username);
        return username;
    }

    public void setUsername(String login) {
        this.username = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String senha) {
        this.password = senha;
    }

    public Boolean getRememberMe() {
        return rememberMe;
    }

    public void setRememberMe(Boolean lembrar) {
        this.rememberMe = lembrar;
    }
    public String getIp(){
        return dirrecionIp;

    }
    
    public void setIp() throws UnknownHostException{
        // Aqui obtenemos la ip local de la maquina
        InetAddress address = InetAddress.getLocalHost();
        //System.out.println("IP Local :"+address.getHostAddress());
        dirrecionIp=address.getHostAddress();
        /**
        // Aqui obtenemos la ip de la web del programador
        String domain="74.125.206.103";
        InetAddress address2 = InetAddress.getByName(domain);
        byte IP[] = address2.getAddress();
        System.out.print("IP del dominio "+domain+" :");
        for (int index = 0; index < IP.length; index++)
        {
           if (index > 0)
                 System.out.print(".");
           System.out.print(((int)IP[index])& 0xff);
        }
                * */
    
    }
}
