package app_escuela;

import javax.swing.SwingUtilities;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.SQLException;

public class App_escuela {

    public static void main(String[] args) {

        // Probar conexión (opcional, si ya lo tenías)
        try (Connection cn = Conexion.getConnection()) {
            System.out.println("Conexión OK a bd_escuela");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Error al conectar con la base de datos:\n" + e.getMessage(),
                    "Error de conexión",
                    JOptionPane.ERROR_MESSAGE
            );
            return;
        }

        // Abrir el MENÚ PRINCIPAL
        SwingUtilities.invokeLater(() -> {
            new FrmMenu().setVisible(true);
        });
    }
}
