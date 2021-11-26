package Modelo;

public class Pantalon {
    private int idPantalon;
    private int tallaPantalon;
    private String colorPantalon;
    private int cantidadPantalon;
    private String observacionesPantalon;

    public Pantalon() {
    }

    public Pantalon(int tallaPantalon, String colorPantalon, int cantidadPantalon, String observacionesPantalon) {
        this.tallaPantalon = tallaPantalon;
        this.colorPantalon = colorPantalon;
        this.cantidadPantalon = cantidadPantalon;
        this.observacionesPantalon = observacionesPantalon;
    }

    public Pantalon(int idPantalon, int tallaPantalon, String colorPantalon, int cantidadPantalon, String observacionesPantalon) {
        this.idPantalon = idPantalon;
        this.tallaPantalon = tallaPantalon;
        this.colorPantalon = colorPantalon;
        this.cantidadPantalon = cantidadPantalon;
        this.observacionesPantalon = observacionesPantalon;
    }
    

    public int getIdPantalon() {
        return idPantalon;
    }

    public void setIdPantalon(int idPantalon) {
        this.idPantalon = idPantalon;
    }

    public int getTallaPantalon() {
        return tallaPantalon;
    }

    public void setTallaPantalon(int tallaPantalon) {
        this.tallaPantalon = tallaPantalon;
    }

    public String getColorPantalon() {
        return colorPantalon;
    }

    public void setColorPantalon(String colorPantalon) {
        this.colorPantalon = colorPantalon;
    }

    public int getCantidadPantalon() {
        return cantidadPantalon;
    }

    public void setCantidadPantalon(int cantidadPantalon) {
        this.cantidadPantalon = cantidadPantalon;
    }

    public String getObservacionesPantalon() {
        return observacionesPantalon;
    }

    public void setObservacionesPantalon(String observacionesPantalon) {
        this.observacionesPantalon = observacionesPantalon;
    }

    @Override
    public String toString() {
        return "Pantalon{" + "idPantalon=" + idPantalon + ", tallaPantalon=" + tallaPantalon + ", colorPantalon=" + colorPantalon + ", cantidadPantalon=" + cantidadPantalon + ", observacionesPantalon=" + observacionesPantalon + '}';
    }
    
    
    
}
