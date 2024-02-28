
package com.mycompany.futbolaccdesodatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author MEDAC
 */
public class FutbolAccdesoDatos {

    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL_CONEXION = "jdbc:mysql://localhost:3306/mydb";

    public static void main(String[] args) throws SQLException {
        final String usuario = "root";
        final String password = "root";
        Connection dbConnection = null;
        Statement statement = null;
        int opcion = 0;
        do {
            
        } while (opcion != 4);
        try {
            //Driver importante
            Class.forName(DRIVER);

            //conesion con la base de datos
            Connection conn = DriverManager.getConnection(URL_CONEXION, usuario, password);

            //Nos va a permitir ejecutar consultas
            statement = conn.createStatement();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            if (statement != null) {
                statement.close();
            }
            if (dbConnection != null) {
                dbConnection.close();
            }
        }

    }
}
