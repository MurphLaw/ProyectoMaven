package Modelo;

public class Cliente {
    private int idCliente;
    private String nombre;
    private double numeroContacto;
    private String contraseña;

    public Cliente() {
    }
    
    //este sería si por ejemplo queremos eliminar un cliente, con el id basta

    public Cliente(int idCliente) {
        this.idCliente = idCliente;
    }
    //para generacion de clientes
    public Cliente(String nombre, double numeroContacto, String contraseña) {
        this.nombre = nombre;
        this.numeroContacto = numeroContacto;
        this.contraseña = contraseña;
    }
    //para modificacion de cliente
    public Cliente(int idCliente, String nombre, double numeroContacto, String contraseña) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.numeroContacto = numeroContacto;
        this.contraseña = contraseña;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNumeroContacto() {
        return numeroContacto;
    }

    public void setNumeroContacto(double numeroContacto) {
        this.numeroContacto = numeroContacto;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "Clientes{" + "idCliente=" + idCliente + ", nombre=" + nombre + ", numeroContacto=" + numeroContacto + ", contraseña=" + contraseña + '}';
    }
    
    
    
    
}
