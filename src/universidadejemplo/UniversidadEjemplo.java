package universidadejemplo;

import java.sql.Connection;
import universidadejemplo.AccesoADatos.Conexion;
import universidadejemplo.Vistas.MenuPrincipal;

public class UniversidadEjemplo {

    public static void main(String[] args) {
       Conexion.getConexion();
       
        
        MenuPrincipal.getWindows();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        }
        );
    }
}
