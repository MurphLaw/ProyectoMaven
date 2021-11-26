package Vista;

import Modelo.Cliente;
import static Modelo.Conexion.getConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ConexionBD {

    public Connection conexion;
    public Statement sentencia;
    public ResultSet resultado;

    public void ConectarBasedeDatos() {

        try {
            //final String Controlador = 
            //Class.forName(Controlador);
            var url = "jdbc:postgresql://localhost:5432/PostresIntento";
            //conexion = DriverManager.getConnection(url,"postgres", "Balanta10");
            conexion = DriverManager.getConnection(url, "postgres", "proyecto1");

            sentencia = conexion.createStatement();
            //var sql = "SELECT id, nombre, contacto, contraseña FROM clientes";
            var sql = "SELECT id_clientes, nombre, contacto, contrasena FROM clientes";



        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void DesconectarBaseDatos() {
        try {
            if (conexion != null) {
                if (sentencia != null) {
                    sentencia.close();
                }
                conexion.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }
    }

    public Connection getConnection() {
        return conexion;
    }

}

/*
    
    public static void main(String[] args) {
        
       // var url = "jdbc:postgresql://localhost:5432/PostresIntento";
        
       
       
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
