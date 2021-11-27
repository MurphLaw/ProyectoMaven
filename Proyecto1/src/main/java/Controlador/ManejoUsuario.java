
package Controlador;

import Modelo.Cliente;

public class ManejoUsuario {
    public static int userId;
    
    public Cliente autenticarUsuario(String correo, String contrasena){
       ClienteDAO clienteDao= new ClienteDAO();
       Cliente logeado;
       logeado=clienteDao.identificar(correo, contrasena);
       userId=logeado.getIdCliente();
        
        return logeado;
    }
}
