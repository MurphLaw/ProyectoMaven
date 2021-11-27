package Controlador;

import java.sql.*;
import java.util.*;
import Modelo.Producto;
import static Modelo.Conexion.*;



public class ProductoDAO {
    //private final String SQL_INSERT="INSERT nombre, talla, color,cantidad,descripcion VALUES(?,?,?,?,?)";
    private final String SQL_INSERT="INSERT INTO productos (id_cliente,talla,color,cantidad,observaciones,producto) VALUES (?,?,?,?,?,?)";
    private final String SQL_SELECT="SELECT producto, talla, color,cantidad, observaciones,producto FROM productos";
    
    
    public void agregarProducto(Producto producto){
        Connection conn= null;
        PreparedStatement stmt=null;
        ResultSet rs=null;
        int registros;
        
        try {
            conn=getConnection();
            stmt=conn.prepareStatement(SQL_INSERT);
            
            stmt.setInt(1, producto.getClienteId);
            stmt.setString(2,producto.getTalla());
            stmt.setString(3,producto.getColor());
            stmt.setInt(4, producto.getCantidad());
            stmt.setString(5, "Ninguna");
            stmt.setString(6, producto.getNombre());
//            stmt.setString(5, producto.getObservaciones());
            registros=stmt.executeUpdate();
            
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
    
        
    }   
    
    public List<Producto> Pedidos(int id_usuario){
        List<Producto> productos= new ArrayList<>();
        Producto producto;
        Connection conn=null;
        PreparedStatement stmt=null;
        ResultSet rs=null;
        
        try {
            conn=getConnection();
            stmt=conn.prepareStatement(SQL_SELECT+" WHERE id_usuario='"+id_usuario+"'");
            rs=stmt.executeQuery();
            while(rs.next()){
                String nombre=rs.getString("nombre");
                String talla=rs.getString("talla");
                String color=rs.getString("color");
                int cantidad=rs.getInt("cantidad");
                String observaciones=rs.getString("observaciones");
                producto= new Producto(nombre,talla,color,cantidad,observaciones);
                productos.add(producto);
            
            
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
        
        return productos;
        
    }
}
    
    
    
    
    
    

