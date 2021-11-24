/*
package Modelo;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class testMiguel {
    public static void main(String[] args) {
        
        var url = "jdbc:postgresql://localhost:5432/PostresIntento";
        
       
       
        try {
            Connection conexion = DriverManager.getConnection(url,"postgres", "Balanta10");
            Statement instruccion = conexion.createStatement();
            var sql = "SELECT id, nombre, contacto, contraseña FROM clientes";
            ResultSet resultado = instruccion.executeQuery(sql);
            while(resultado.next()){
                System.out.print("id :" + resultado.getInt("id"));
                System.out.print("  nombre :" + resultado.getString("nombre"));
                System.out.println("");
                
            }
            resultado.close();
            instruccion.close();
            conexion.close();
        } catch (SQLException ex) {
          ex.printStackTrace(System.out);
        }
        
    }
}
*/
