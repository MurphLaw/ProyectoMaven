package Modelo;

public class Camisa {
    private int idCamisa;
    private String tallaCamisa;
    private String colorCamisa;
    private int cantidadCamisa;
    private String observacionesCamisa;

    public Camisa() {
    }

    public Camisa(String tallaCamisa, String colorCamisa, int cantidadCamisa, String observacionesCamisa) {
        this.tallaCamisa = tallaCamisa;
        this.colorCamisa = colorCamisa;
        this.cantidadCamisa = cantidadCamisa;
        this.observacionesCamisa = observacionesCamisa;
    }

    public Camisa(int idCamisa, String tallaCamisa, String colorCamisa, int cantidadCamisa, String observacionesCamisa) {
        this.idCamisa = idCamisa;
        this.tallaCamisa = tallaCamisa;
        this.colorCamisa = colorCamisa;
        this.cantidadCamisa = cantidadCamisa;
        this.observacionesCamisa = observacionesCamisa;
    }
    
    

    public int getIdCamisa() {
        return idCamisa;
    }

    public void setIdCamisa(int idCamisa) {
        this.idCamisa = idCamisa;
    }

    public String getTallaCamisa() {
        return tallaCamisa;
    }

    public void setTallaCamisa(String tallaCamisa) {
        this.tallaCamisa = tallaCamisa;
    }

    public String getColorCamisa() {
        return colorCamisa;
    }

    public void setColorCamisa(String colorCamisa) {
        this.colorCamisa = colorCamisa;
    }

    public int getCantidadCamisa() {
        return cantidadCamisa;
    }

    public void setCantidadCamisa(int cantidadCamisa) {
        this.cantidadCamisa = cantidadCamisa;
    }

    public String getObservacionesCamisa() {
        return observacionesCamisa;
    }

    public void setObservacionesCamisa(String observacionesCamisa) {
        this.observacionesCamisa = observacionesCamisa;
    }

    @Override
    public String toString() {
        return "Camisa{" + "idCamisa=" + idCamisa + ", tallaCamisa=" + tallaCamisa + ", colorCamisa=" + colorCamisa + ", cantidadCamisa=" + cantidadCamisa + ", observacionesCamisa=" + observacionesCamisa + '}';
    }
    
    
    
}