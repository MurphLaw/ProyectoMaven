
package Modelo;

public class Producto {
    private String nombre;
    private String talla;
    private String color;
    private int cantidad;
    private String observaciones;
    private int clienteId;

    public Producto() {
    }

    public Producto(String nombre, String talla, String color, int cantidad,int clienteId) {
        this.nombre = nombre;
        this.talla = talla;
        this.color = color;
        this.cantidad = cantidad;
        this.clienteId=clienteId;
    }

    public Producto(String nombre, String talla, String color, int cantidad,int clienteId, String observaciones) {
        this.nombre = nombre;
        this.talla = talla;
        this.color = color;
        this.cantidad = cantidad;
        this.clienteId=clienteId;
        this.observaciones = observaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }
    
    

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", talla=" + talla + ", color=" + color + ", cantidad=" + cantidad + ", observaciones=" + observaciones + ", clienteId=" + clienteId + '}';
    }

   
    
    
    
}
