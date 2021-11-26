package Modelo;

import java.sql.*;

public class Conexion {
    private static final String JDBC_URL="jdbc:postgresql://localhost:5432/PostresIntento";
    private static final String JDBC_USER="postgres";
    private static final String JDBC_PASSWORD="proyecto1";
    
    
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(JDBC_URL,JDBC_USER,JDBC_PASSWORD);
    }
    
    public static void close(Statement smtm) throws SQLException{
        smtm.close();
    }
    
    public static void close(PreparedStatement smtm) throws SQLException{
    smtm.close();
    }
    
    public static void close(Connection conn) throws SQLException{
        conn.close();
    }
    
    public static void close(ResultSet rs) throws SQLException{
        rs.close();
    }
}
