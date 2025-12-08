package app_escuela;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class AlumnoDAO {

    public boolean insertar(Alumno a) {
        String sql = "INSERT INTO alumno "
                   + "(matricula, nombre_s, ap_pat, ap_mat, semestre, carrera_id) "
                   + "VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection cn = Conexion.getConnection();
             PreparedStatement ps = cn.prepareStatement(sql)) {

            ps.setInt(1, a.getMatricula());
            ps.setString(2, a.getNombre_s());
            ps.setString(3, a.getAp_pat());
            ps.setString(4, a.getAp_mat());
            ps.setInt(5, a.getSemestre());
            ps.setInt(6, a.getCarrera_id());

            int filas = ps.executeUpdate();
            return filas > 0;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,
                    "Error al insertar alumno: " + e.getMessage());
            return false;
        }
    }

    public boolean actualizar(Alumno a) {
        String sql = "UPDATE alumno SET "
                   + "nombre_s = ?, ap_pat = ?, ap_mat = ?, "
                   + "semestre = ?, carrera_id = ? "
                   + "WHERE matricula = ?";

        try (Connection cn = Conexion.getConnection();
             PreparedStatement ps = cn.prepareStatement(sql)) {

            ps.setString(1, a.getNombre_s());
            ps.setString(2, a.getAp_pat());
            ps.setString(3, a.getAp_mat());
            ps.setInt(4, a.getSemestre());
            ps.setInt(5, a.getCarrera_id());
            ps.setInt(6, a.getMatricula());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,
                    "Error al actualizar alumno: " + e.getMessage());
            return false;
        }
    }

    public boolean eliminar(int matricula) {
        String sql = "DELETE FROM alumno WHERE matricula = ?";

        try (Connection cn = Conexion.getConnection();
             PreparedStatement ps = cn.prepareStatement(sql)) {

            ps.setInt(1, matricula);
            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,
                    "Error al eliminar alumno: " + e.getMessage());
            return false;
        }
    }

    public List<Alumno> listar() {
        List<Alumno> lista = new ArrayList<>();
        String sql = "SELECT matricula, nombre_s, ap_pat, ap_mat, semestre, carrera_id FROM alumno";

        try (Connection cn = Conexion.getConnection();
             PreparedStatement ps = cn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Alumno a = new Alumno();
                a.setMatricula(rs.getInt("matricula"));
                a.setNombre_s(rs.getString("nombre_s"));
                a.setAp_pat(rs.getString("ap_pat"));
                a.setAp_mat(rs.getString("ap_mat"));
                a.setSemestre(rs.getInt("semestre"));
                a.setCarrera_id(rs.getInt("carrera_id"));
                lista.add(a);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,
                    "Error al listar alumnos: " + e.getMessage());
        }
        return lista;
    }
}
