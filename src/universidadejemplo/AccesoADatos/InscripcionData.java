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
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import universidadejemplo.Entidades.Alumno;
import universidadejemplo.Entidades.Inscripcion;
import universidadejemplo.Entidades.Materia;

/**
 *
 * @author bruno
 */
public class InscripcionData {
    
    private Connection con = null;
    AlumnoData aData;
    MateriaData mData;
    
    public InscripcionData() {
        con = Conexion.getConexion();
    }
    
    
    public void guardarInscripcion(Inscripcion ins){
        String sql = "Insert into inscripto(idInscripto,nota,idAlumno,idMateria) values (?,?,?) ";
        try {
            PreparedStatement ps=con.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setInt(1, ins.getAlumno().getIdAlumno());
            ps.setInt(2, ins.getMateria().getIdMateria());
            ps.setDouble(3, ins.getNota());
            ps.executeUpdate();
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()){
                ins.setIdInscripcion(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Inscripcion registrada");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripciones");
        }
        
    }
    public List<Inscripcion>obtenerInscripciones(){
        
    }
    public List<Inscripcion>obtenerInscripcionesPorAlumno(int id){
        
    }
    public List<Materia>obtenerMateriasCursadas(int id){
        
    }
    public List<Materia>obtenerMateriasNoCursadas(int id){
        
    }
    public void borrarInscripcionMateriaAlumnos(int idAlumno, int idMateria){
        
    }        
    public void actualizarNota (int idAlumno, int idMateria, double nota){
        
    }   
    public List<Alumno> obtenerAlumnoXMateria(int idMateria){
        
    }
}
