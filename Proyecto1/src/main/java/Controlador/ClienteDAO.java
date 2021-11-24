package Controlador;
import java.sql.*;
import java.util.*;
import Modelo.Cliente;
import Modelo.Conexion;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClienteDAO {
    private static final String SQL_SELECT="SELECT id, nombre, contacto,contraseña FROM clientes";
    
    public List<Cliente> seleccionar(){
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs= null;
        Cliente cliente;
        List<Cliente> clientes = new ArrayList<>();
        try { 
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while(rs.next()){
                int idCliente = rs.getInt("id");
                String nombre = rs.getString("nombre");
                int numeroContacto=rs.getInt("contacto");
                String contraseña=rs.getString("contraseña");
                cliente = new Cliente(idCliente,nombre,numeroContacto,contraseña);
                clientes.add(cliente);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            try {
                Conexion.close(rs);
                Conexion.close(stmt);
                Conexion.close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return clientes;
    }
    
}
