package Smart;

public class SmartPhone extends SmartDevie {
    private String camara="";
    private String bateria="";
    private String pantalla="";

    public SmartPhone() {
        super();
    }

    public SmartPhone(String name, String model, String color, String procesador, int ram, String almacenamiento, String SO, String camara, String bateria, String pantalla) {
        super(name, model, color, procesador, ram, almacenamiento, SO);
        this.camara = camara;
        this.bateria = bateria;
        this.pantalla = pantalla;
    }

    public String getCamara() {
        return camara;
    }

    public void setCamara(String camara) {
        this.camara = camara;
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

    @Override
    public String toString(){
        return super.getName()+" "+super.getModel()+" "+super.getColor()+" "+super.getProcesador()+" "+super.getRam()+" "+super.getAlmacenamiento()+" "+super.getSO()+" "+this.camara+" "+this.bateria+" "+this.pantalla;
    }
}

