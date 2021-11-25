package Controlador;

import java.sql.*;
import java.util.*;
import Modelo.Pantalon;
import static Modelo.Conexion.*;

public class PantalonDAO {
     private static final String SQL_SELECT="SELECT id_pantalones, talla, color,cantidad,observaciones FROM pantalones";
    private static final String SQL_INSERT="INSERT into pantalones(talla, color, cantidad,observaciones) VALUES(?,?,?,?)";
    
    public List<Pantalon> seleccionar(){
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs= null;
        Pantalon pantalon;
        List<Pantalon> pantalones = new ArrayList<>();
        try { 
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while(rs.next()){
                int idPantalon = rs.getInt("id_pantalones");
                int tallaPantalon = rs.getInt("talla");
                String colorPantalon=rs.getString("color");
                int cantidadPantalon=rs.getInt("cantidad");
                String  observacionesPantalon=rs.getString("observaciones");
                pantalon = new Pantalon(idPantalon,tallaPantalon,colorPantalon,cantidadPantalon,observacionesPantalon);
                pantalones.add(pantalon);
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
        return pantalones;
    }
    
    public int insertar(Pantalon pantalon){
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        
        try {
            conn = getConnection();
            stmt=conn.prepareStatement(SQL_INSERT);
            stmt.setInt(1,pantalon.getTallaPantalon());
            stmt.setString(2,pantalon.getColorPantalon());
            stmt.setInt(3,pantalon.getCantidadPantalon());
            stmt.setString(4,pantalon.getObservacionesPantalon());
            
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

