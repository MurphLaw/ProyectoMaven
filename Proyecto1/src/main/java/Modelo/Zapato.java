package Modelo;

public class Zapato {
    private int idZapato;
    private int tallaZapato;
    private String colorZapato;
    private int cantidadZapato;
    private String observacionesZapato;

    public Zapato() {
    }

    public Zapato(int tallaZapato, String colorZapato, int cantidadZapato, String observacionesZapato) {
        this.tallaZapato = tallaZapato;
        this.colorZapato = colorZapato;
        this.cantidadZapato = cantidadZapato;
        this.observacionesZapato = observacionesZapato;
    }

    public Zapato(int idZapato, int tallaZapato, String colorZapato, int cantidadZapato, String observacionesZapato) {
        this.idZapato = idZapato;
        this.tallaZapato = tallaZapato;
        this.colorZapato = colorZapato;
        this.cantidadZapato = cantidadZapato;
        this.observacionesZapato = observacionesZapato;
    }
    
    

    public int getIdZapato() {
        return idZapato;
    }

    public void setIdZapato(int idZapato) {
        this.idZapato = idZapato;
    }

    public int getTallaZapato() {
        return tallaZapato;
    }

    public void setTallaZapato(int tallaZapato) {
        this.tallaZapato = tallaZapato;
    }

    public String getColorZapato() {
        return colorZapato;
    }

    public void setColorZapato(String colorZapato) {
        this.colorZapato = colorZapato;
    }

    public int getCantidadZapato() {
        return cantidadZapato;
    }

    public void setCantidadZapato(int cantidadZapato) {
        this.cantidadZapato = cantidadZapato;
    }

    public String getObservacionesZapato() {
        return observacionesZapato;
    }

    public void setObservacionesZapato(String observacionesZapato) {
        this.observacionesZapato = observacionesZapato;
    }

    @Override
    public String toString() {
        return "Zapatos{" + "idZapato=" + idZapato + ", tallaZapato=" + tallaZapato + ", colorZapato=" + colorZapato + ", cantidadZapato=" + cantidadZapato + ", observacionesZapato=" + observacionesZapato + '}';
    }

    
    
}
