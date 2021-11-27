
package Controlador;

import Modelo.Cliente;
import Modelo.Conexion;
import Vista.Bienvenida;
import Vista.Login;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Cliente Control {
    public static boolean autenticacion(String nombre, String contrasena){
        ClienteDAO clienteDao= new ClienteDAO();
        
        boolean loginExitoso=clienteDao.identificar(nombre, contrasena);
        return ;   
    }
    
 
    
}
