import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBKonexioa {
    private static final String URL = "";
    private static final String erabiltzailea = "root";
    private static final String pasahitza = "root";

    public static Connection getConexion() throws SQLException {
        return DriverManager.getConnection(URL, erabiltzailea, pasahitza);
    }
}
.