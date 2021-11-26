package Modelo;

public class Cliente {
    private int idCliente;
    private String nombre;
    private double numeroContacto;
    private String contrasena;

    public Cliente() {
    }
    
    //este sería si por ejemplo queremos eliminar un cliente, con el id basta

    public Cliente(int idCliente) {
        this.idCliente = idCliente;
    }
    //para generacion de clientes
    public Cliente(String nombre, double numeroContacto, String contrasena) {
        this.nombre = nombre;
        this.numeroContacto = numeroContacto;
        this.contrasena = contrasena;
    }
    //para modificacion de cliente
    public Cliente(int idCliente, String nombre, double numeroContacto, String contrasena) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.numeroContacto = numeroContacto;
        this.contrasena = contrasena;
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

    public String getContrasena() {
        return contrasena;
    }

    public void setContraseña(String contrasena) {
        this.contrasena = contrasena;
    }

    @Override
    public String toString() {
        return "Clientes{" + "idCliente= " + idCliente + ", nombre= " + nombre + ", numeroContacto= " + numeroContacto + ", contraseña= " + contrasena + '}';
    }
    
    
    
    
}
