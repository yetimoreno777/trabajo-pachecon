package app_escuela;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CarreraDAO {

    public List<Carrera> listar() {
        List<Carrera> lista = new ArrayList<>();
        String sql = "SELECT ID, nombre_car FROM carrera";

        try (Connection cn = Conexion.getConnection();
             PreparedStatement ps = cn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Carrera c = new Carrera();
                c.setId(rs.getInt("ID"));
                c.setNombre_car(rs.getString("nombre_car"));
                lista.add(c);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,
                    "Error al listar carreras: " + e.getMessage());
        }

        return lista;
    }
}
