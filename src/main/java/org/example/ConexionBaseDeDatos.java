package org.example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class ConexionBaseDeDatos {
    private static final String URL = "jdbc:mysql://localhost:3306/BaseDeDatos";
    private  static final String USERNAME = "root";
    private static final String PASSWORD = "Misterpandita123.";
    public void mostrarDatos() {
        try (Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             Statement stmt = con.createStatement()) {
            ResultSet rs = stmt.executeQuery("select * from Datos");
            while (rs.next()) {
                System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

