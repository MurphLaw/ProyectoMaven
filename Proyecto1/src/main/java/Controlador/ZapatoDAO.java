package Controlador;

import Modelo.*;
import java.sql.*;
import java.util.*;
import static Modelo.Conexion.*;



public class ZapatoDAO {
     private static final String SQL_SELECT="SELECT id_zapatos, talla, color,cantidad,observaciones FROM zapatos";
    private static final String SQL_INSERT="INSERT into zapatos(talla, color, cantidad,observaciones,id_clientes_zapatos) VALUES(?,?,?,?,?)";
    
    public List<Zapato> seleccionar(){
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs= null;
        Zapato zapato;
        List<Zapato> zapatos = new ArrayList<>();
        try { 
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while(rs.next()){
                int idZapato = rs.getInt("id_zapatos");
                int tallaZapato = rs.getInt("talla");
                String colorZapato=rs.getString("color");
                int cantidadZapato=rs.getInt("cantidad");
                String  observacionesZapato=rs.getString("observaciones");
                zapato = new Zapato(idZapato,tallaZapato,colorZapato,cantidadZapato,observacionesZapato);
                zapatos.add(zapato);
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
        return zapatos;
    }
    
    public int insertar(Zapato zapato){
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        
        try {
            conn = getConnection();
            stmt=conn.prepareStatement(SQL_INSERT);
            
            stmt.setInt(1,zapato.getTallaZapato());
            stmt.setString(2,zapato.getColorZapato());
            stmt.setInt(3,zapato.getCantidadZapato());
            stmt.setString(4,zapato.getObservacionesZapato());
            stmt.setInt(5,1);
            
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

