package universidadejemplo.AccesoADatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexion {

    private static final String url = "jdbc:mariadb://localhost/";
    private static final String DB = "universidad";
    private static final String usuario = "root";
    private static final String pass = "";
    private static Connection connection;
    
    private Conexion(){
    }
    
    public static Connection getConexion(){
        if(connection ==null){
            try{
                Class.forName("org.mariadb.jdbc.Driver");
                connection=DriverManager.getConnection((url+DB),usuario,pass);
            }catch (ClassNotFoundException ex){
                JOptionPane.showMessageDialog(null,"Error al cargar los driver");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Error al conectarse");
            }
        }return connection;
    }
    
    
    
    
    
}
