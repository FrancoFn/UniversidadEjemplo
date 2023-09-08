
package universidadejemplo.AccesoADatos;

import java.sql.PreparedStatement;
import universidadejemplo.Entidades.Alumno;


public class AlumnoData {
    
    //private Connection con=null;
    
    
    public AlumnoData(){
       // con=Conexion.getConexion();
    }
    public void guardarAlumno(Alumno alumno){
       String sql="INSERT INTO alumno (dni,apellido,nombre,fechaNacimiento"
               + "estado) VALUES (?,?,?,?,?)" ;
        PreparedStatement ps = con.prepareStatement(sql.Statement.RETURN_GENERAL_KEYS);
    }
    
    
    
    
}
