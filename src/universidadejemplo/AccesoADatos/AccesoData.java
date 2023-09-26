/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadejemplo.AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import universidadejemplo.Entidades.Acceso;
import universidadejemplo.Entidades.Materia;

/**
 *
 * @author bruno
 */
public class AccesoData {
     private Connection con = null;

    public AccesoData() {
        con = Conexion.getConexion();
    }

    public void activaR(){
        
    }
    public void desactivar(){
        
    }
    public Acceso loG(String usuario, String contrasenia){
        String sql = "SELECT * FROM accesocontrasenia Where (Usuario ='"+usuario+"') and (contrasenia='"+contrasenia+"');";
        Acceso acceso=null;
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                acceso = new Acceso();
                acceso.setNivel(rs.getInt("Nivel"));
                acceso.setUsuario(rs.getString("Usuario"));
                acceso.setContrasenia(rs.getString("contrasenia"));                
                acceso.setAcceso(rs.getBoolean("activo"));
            } else {
                JOptionPane.showMessageDialog(null, "Usuario no registrado");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla acceso");
        }return acceso;
    }
    
    
    
}
