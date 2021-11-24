
package Test;

import Controlador.ClienteDAO;
import Modelo.Cliente;
import java.util.List;

public class TestManejo {
    public static void main(String[] args) {
        ClienteDAO clienteDao = new ClienteDAO();
        List<Cliente> clientes = clienteDao.seleccionar();
        clientes.forEach(cliente -> {
            System.out.println("cliente = " + cliente);
        });
    }
}
