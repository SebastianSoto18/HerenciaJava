package Smart;

public class SmartWatch extends SmartDevie {
    private String bateria="";
    private String pantalla="";
    private String pulsera="";

    public SmartWatch() {
        super();
    }

    public SmartWatch(String name, String model, String color, String procesador, int ram, String almacenamiento, String SO, String bateria, String pantalla, String pulsera) {
        super(name, model, color, procesador, ram, almacenamiento, SO);
        this.bateria = bateria;
        this.pantalla = pantalla;
        this.pulsera = pulsera;
    }

    public String getBateria() {
        return bateria;
    }

    public void setBateria(String bateria) {
        this.bateria = bateria;
    }

    public String getPantalla() {
        return pantalla;
    }

    public void setPantalla(String pantalla) {
        this.pantalla = pantalla;
    }

    public String getPulsera() {
        return pulsera;
    }

    public void setPulsera(String pulsera) {
        this.pulsera = pulsera;
    }

    @Override
    public String toString(){
        return super.getName()+" "+super.getModel()+" "+super.getColor()+" "+super.getProcesador()+" "+super.getRam()+" "+super.getAlmacenamiento()+" "+super.getSO()+" "+this.bateria+" "+this.pantalla+" "+this.pulsera;
    }
}

