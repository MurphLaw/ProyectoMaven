package Controlador;

import java.sql.*;
import java.util.*;
import Modelo.Cliente;
import static Modelo.Conexion.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ClienteDAO {
    
    private static final String SQL_SELECT="SELECT id_clientes, nombre, contacto,contrasena FROM clientes";
    private static final String SQL_INSERT="INSERT into clientes(nombre, contacto, contrasena) VALUES(?,?,?)";
    
    
    public List<Cliente> seleccionar(){
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs= null;
        Cliente cliente;
        List<Cliente> clientes = new ArrayList<>();
        try { 
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while(rs.next()){
                int idCliente = rs.getInt("id_clientes");
                String nombre = rs.getString("nombre");
                int numeroContacto=rs.getInt("contacto");
                String contraseña=rs.getString("contrasena");
                cliente = new Cliente(idCliente,nombre,numeroContacto,contraseña);
                clientes.add(cliente);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            try {
                close(rs);
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return clientes;
    }
    
    public int insertar(Cliente cliente){
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        
        try {
            conn = getConnection();
            stmt=conn.prepareStatement(SQL_INSERT);
            stmt.setString(1,cliente.getNombre());
            stmt.setDouble(2,cliente.getNumeroContacto());
            stmt.setString(3, cliente.getContraseña());
            registros = stmt.executeUpdate();
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            try {
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
            
            
        }
        return registros;
    }
}
