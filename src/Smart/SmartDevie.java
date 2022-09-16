package Smart;

public abstract class SmartDevie {
    private String name="";
    private String model="";
    private String color="";
    private String procesador="";
    private int ram=0;
    private String almacenamiento;
    private String SO;

    public SmartDevie() {
    }

    public SmartDevie(String name, String model, String color, String procesador, int ram, String almacenamiento, String SO) {
        this.name = name;
        this.model = model;
        this.color = color;
        this.procesador = procesador;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        this.SO = SO;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(String almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String getSO() {
        return SO;
    }

    public void setSO(String SO) {
        this.SO = SO;
    }
}
