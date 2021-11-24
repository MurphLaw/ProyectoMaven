
package Test;

import Controlador.ClienteDAO;
import Modelo.Cliente;
import java.util.List;

public class TestManejo {
    public static void main(String[] args) {
        ClienteDAO clienteDao = new ClienteDAO();
        
        //prueba de insertar 7u7

        Cliente clienteNew = new Cliente(60,"Pepito",11111,"1235");
        clienteDao.insertar(clienteNew);
        List<Cliente> clientes = clienteDao.seleccionar();
        clientes.forEach(cliente -> {
            System.out.println("cliente = " + cliente);
        });
        
        
        
        
    }
}
