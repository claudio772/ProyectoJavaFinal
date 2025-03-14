package dao;

import conexion.ConexionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {

    public boolean validarUsuario(String email, String contraseña) {
        boolean validar = false;

        String sql = "SELECT * FROM login WHERE email = ? AND contraseña = ?";

        try {
            //obtenemos la conexion
            Connection conexion = ConexionDB.obtenerConexion();
            //preparar la consulta
            PreparedStatement consulta = conexion.prepareStatement(sql);
            //argumentos
            consulta.setString(1, email);
            consulta.setString(2, contraseña);
            //ejecutar la consulta
            ResultSet resultado = consulta.executeQuery();
            
            validar = resultado.next();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return validar;
    }
}
