package Controlador;

import java.sql.*;
import java.util.*;
import Modelo.Cliente;
import static Modelo.Conexion.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ClienteDAO {
    
    private static final String SQL_SELECT="SELECT id_clientes, nombre, contacto,contrasena, correo FROM clientes";
    private static final String SQL_INSERT="INSERT into clientes(nombre, contacto, contrasena, correo) VALUES(?,?,?,?)";
    
                    
    
    
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
                String contrasena=rs.getString("contrasena");
                String correo=rs.getString("correo");
                cliente = new Cliente(idCliente,nombre,numeroContacto,contrasena,correo);
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
            stmt.setString(3, cliente.getContrasena());
            stmt.setString(4,cliente.getCorreo());
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
    
    public Cliente identificar(String correo, String contrasena){
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs= null;
        Cliente cliente= new Cliente();
//        boolean exito=false;
        try {
            
            conn = getConnection();
            stmt=conn.prepareStatement(SQL_SELECT+" WHERE correo='"+correo+"' AND contrasena='"+contrasena+"'");
            rs = stmt.executeQuery();
            if(rs.next()){
                int idCliente = rs.getInt("id_clientes");
                String nombre = rs.getString("nombre");
                int numeroContacto=rs.getInt("contacto");
                String contrasenaUser=rs.getString("contrasena");
                String correoUser=rs.getString("correo");
                cliente = new Cliente(idCliente,nombre,numeroContacto,contrasenaUser,correoUser);
//                System.out.println("cliente = " + cliente);
//                cliente.setContraseña(rs.getString("contrasena"));
//                cliente.setIdCliente(rs.getInt("id_clientes"));
//                cliente.setNombre(rs.getString("nombre"));
//                cliente.setNumeroContacto(rs.getInt("contacto"));
//                System.out.println("Cliente 1 " +cliente);
//                exito=true;
                
            }
            else{
//                
               
            }
              
            
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
        
        return cliente;
    }
    
}
