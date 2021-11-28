package Controlador;
    
import Modelo.Cliente;

public class ManejoUsuarioNuevo {
    
    ClienteDAO clienteDao= new ClienteDAO();
    
    public boolean UsuarioExistente(String Correo){
        
        boolean existe=clienteDao.verificarCorreo(Correo);
        
        return existe;
    }
    
    public void RegistrarUsuario(Cliente cliente){
        clienteDao.insertar(cliente);
    }
}
