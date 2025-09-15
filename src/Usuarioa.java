import java.sql.*;

public class Usuarioa {
    public boolean UsuarioaBalioztatu(String izena, String pasahitza) {
        String sql = "SELECT * FROM usuarioak WHERE izena=? AND pasahitza=?";
        try (Connection conn = DBKonexioa.getConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, izena);
            stmt.setString(2, pasahitza);
            ResultSet rs = stmt.executeQuery();

            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}