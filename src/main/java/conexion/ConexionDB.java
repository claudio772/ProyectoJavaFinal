/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author CLAUDIO
 */
public class ConexionDB {
    private static final String url = "jdbc:mysql://localhost:3306/proyectojavaFinal";
    private static final String user = "root";
    private static final String password = "AquilesVa780";

    public static Connection obtenerConexion() throws SQLException {
        try {
            // Cargar el driver
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new SQLException("No se encontró el driver JDBC", e);
        }
        return DriverManager.getConnection(url, user, password);
    }

    //Prueba de conexion
//    public static void main(String[] args) {
//        try {
//            Connection con = ConexionDB.obtenerConexion();
//            if(con != null){
//                System.out.println("Conexion exitosa");
//            }
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }
//    }

}


