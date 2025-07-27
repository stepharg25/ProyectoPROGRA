package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    private Connection con = null;
    private final String base = "biblioteca";
    private final String url  = "jdbc:mysql://localhost:3306/" + base;
    private final String user = "root";
    private final String password = "";

    public Connection getConexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Error BD: " + e.getMessage());
        }
        return con;
    }
}
