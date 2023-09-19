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

    public void guardarInscripcion(Inscripcion ins) {
        String sql = "Insert into inscripto(nota,idAlumno,idMateria) values (?,?,?) ";
        try {
            PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setDouble(1, ins.getNota());
            ps.setInt(2, ins.getAlumno().getIdAlumno());
            ps.setInt(3, ins.getMateria().getIdMateria());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                ins.setIdInscripcion(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Inscripcion registrada");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripciones");
        }

    }

    public List<Inscripcion> obtenerInscripciones() {
        ArrayList<Inscripcion> cursadas = new ArrayList<>();
        String sql = "select * from inscripto";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Inscripcion ins = new Inscripcion();
                ins.setIdInscripcion(rs.getInt("idInscripto"));
                Alumno alumno = aData.buscarAlumno(rs.getInt("idAlumno"));
                Materia materia = mData.buscarMateria(rs.getInt("idMateria"));
                ins.setAlumno(alumno);
                ins.setMateria(materia);
                ins.setNota(rs.getDouble("nota"));
                cursadas.add(ins);

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Inscripcion borrada");
        }
        return cursadas;
    }

    public List<Inscripcion> obtenerInscripcionesPorAlumno(int id) {
        ArrayList<Inscripcion> cursadas = new ArrayList<>();
        String sql = "select * from inscripto where idAlumno=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Inscripcion ins = new Inscripcion();
                ins.setIdInscripcion(rs.getInt("idInscripto"));
                Alumno alumno = aData.buscarAlumno(rs.getInt("idAlumno"));
                Materia materia = mData.buscarMateria(rs.getInt("idMateria"));
                ins.setAlumno(alumno);
                ins.setMateria(materia);
                ins.setNota(rs.getDouble("nota"));
                cursadas.add(ins);

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripciones");
        }
        return cursadas;
    }

    public List<Materia> obtenerMateriasCursadas(int id) {
        ArrayList<Materia> materias = new ArrayList<>();
        String sql = "SELECT I.idMateria,E.nombre,E.anio,I.nota FROM "
                + "materia E join inscripto I WHERE (I.idMateria = E.idMateria)"
                + "and (I.idAlumno = ?)";
        Materia materia = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("anio"));
                materia.setNota(rs.getDouble("nota"));
                materias.add(materia);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripciones");
        }
        return materias;
    }

    public List<Materia> obtenerMateriasNoCursadas(int id) {
        ArrayList<Materia> materias = new ArrayList<>();
        String sql = "Select * from materia where estado= 1 and idMateria not in"
                + "(Select idMateria from inscripto where idAlumno=?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("anio"));
                materias.add(materia);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripciones");
        }
        return materias;
    }

    public void borrarInscripcionMateriaAlumnos(int idAlumno, int idMateria) {
        String sql = "delete from inscripto where idAlumno =? and idMateria=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);
            int filas = ps.executeUpdate();
            if (filas > 0) {
                JOptionPane.showMessageDialog(null, "Inscripcion borrada");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripciones");
        }
    }

    public void actualizarNota(int idAlumno, int idMateria, double nota) {
        String sql = "UPDATE  inscripto set nota =? where idAlumno =? and idMateria = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1, nota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idMateria);
            int filas = ps.executeUpdate();
            if (filas > 0) {
                JOptionPane.showMessageDialog(null, "Nota Actualizada");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripciones");
        }
    }

    public List<Alumno> obtenerAlumnoXMateria(int idMateria) {
        ArrayList<Alumno> alumnosMateria = new ArrayList<>();
        String sql = "Select a.idAlumno,dni,nombre,apellido,fechaNacimiento,estado"
                + "from inscripto i, alumno a Where i.idAlumno = a.idAlumno and idMateria = ? and a.estado=1";
        try {
            PreparedStatement ps = con.prepareCall(sql);
            ps.setInt(1, idMateria);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Alumno alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNac(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setActivo(rs.getBoolean("estado"));
                alumnosMateria.add(alumno);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripciones");
        }
        return alumnosMateria;
    }

}
