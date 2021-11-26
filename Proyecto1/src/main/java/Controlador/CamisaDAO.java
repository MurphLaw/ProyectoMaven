package Controlador;

import java.sql.*;
import java.util.*;
import Modelo.Camisa;
import static Modelo.Conexion.*;

public class CamisaDAO {
    private static final String SQL_SELECT="SELECT id_camisas, talla, color,cantidad,observaciones FROM camisas";
    private static final String SQL_INSERT="INSERT into camimsas(talla, color, cantidad,observaciones) VALUES(?,?,?,?)";
    
    public List<Camisa> seleccionar(){
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs= null;
        Camisa camisa;
        List<Camisa> camisas = new ArrayList<>();
        try { 
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while(rs.next()){
                int idCamisa = rs.getInt("id_camisas");
                String tallaCamisa = rs.getString("talla");
                String colorCamisa=rs.getString("color");
                int cantidadCamisa=rs.getInt("cantidad");
                String  observacionesCamisa=rs.getString("observaciones");
                camisa = new Camisa(idCamisa,tallaCamisa,colorCamisa,cantidadCamisa,observacionesCamisa);
                camisas.add(camisa);
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
        return camisas;
    }
    
    public int insertar(Camisa camisa){
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        
        try {
            conn = getConnection();
            stmt=conn.prepareStatement(SQL_INSERT);
            stmt.setString(1,camisa.getTallaCamisa());
            stmt.setString(2,camisa.getColorCamisa());
            stmt.setInt(3, camisa.getCantidadCamisa());
            stmt.setString(4,camisa.getObservacionesCamisa());
            
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

