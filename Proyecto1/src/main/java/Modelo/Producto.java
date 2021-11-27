
package Modelo;

public class Producto {
    private String nombre;
    private String talla;
    private String color;
    private int cantidad;
    private String observaciones;

    public Producto() {
    }

    public Producto(String nombre, String talla, String color, int cantidad) {
        this.nombre = nombre;
        this.talla = talla;
        this.color = color;
        this.cantidad = cantidad;
    }

    public Producto(String nombre, String talla, String color, int cantidad, String observaciones) {
        this.nombre = nombre;
        this.talla = talla;
        this.color = color;
        this.cantidad = cantidad;
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

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", talla=" + talla + ", color=" + color + ", cantidad=" + cantidad + ", observaciones=" + observaciones + '}';
    }
    
    
    
    
}
