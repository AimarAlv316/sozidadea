import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBKonexioa {
    private static final String ruta = "jdbc:mysql://localhost:3306/sozidadea";
    private static final String usuarioa = "root";
    private static final String pasahitza = "zure_pasahitza";

    public static Connection getConexion() throws SQLException {
        return DriverManager.getConnection(ruta, usuarioa, pasahitza);
    }
}