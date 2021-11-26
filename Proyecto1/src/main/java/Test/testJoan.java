
package Test;

import Controlador.ClienteDAO;
import Modelo.Cliente;
import Vista.Login;
import java.util.List;

public class testJoan { 
    public static void main(String[] args) {
        ClienteDAO clienteDao = new ClienteDAO();
        
        
        Login login = new Login();
        login.setVisible(true);
        //prueba de insertar 7u7

        //Cliente clienteNew = new Cliente("Pepito",11111,"1235");
        //clienteDao.insertar(clienteNew);
        List<Cliente> clientes = clienteDao.seleccionar();
        clientes.forEach(cliente -> {
            System.out.println("nombre = " + cliente.getNombre()+"\n"+"contraseña = "+ cliente.getNumeroContacto());
        });
        
        
         
        
        
    }
}
