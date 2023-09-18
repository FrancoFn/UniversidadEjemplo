/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadejemplo.Entidades;

/**
 *
 * @author bruno
 */
public class Acceso {
    private String usuario;
    private String contrasenia;
    public int nivel;
    private boolean acceso;
   
    public Acceso() {
    }

    public Acceso(String usuario, String contrasenia, int nivel, boolean acceso) {
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.nivel = nivel;
        this.acceso = acceso;
    }

   

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }


    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public boolean isAcceso() {
        return acceso;
    }

    public void setAcceso(boolean acceso) {
        this.acceso = acceso;
    }
    
    
    
}
