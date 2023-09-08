package universidadejemplo;

import java.sql.Connection;
import universidadejemplo.AccesoADatos.Conexion;

public class UniversidadEjemplo {

    public static void main(String[] args) {
       Connection con= Conexion.getConexion();
    }
    
}
