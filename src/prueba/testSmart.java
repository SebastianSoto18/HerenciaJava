package prueba;

import Smart.SmartPhone;
import Smart.SmartWatch;

public class testSmart {

    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone();
        phone.setCamara("35mpx");
        phone.setBateria("2000mah");
        phone.setPantalla("5.5");
        phone.setColor("Rojo");
        phone.setProcesador("Snapdragon 845");
        phone.setRam(4);
        phone.setAlmacenamiento("64gb");
        phone.setSO("Android 9.0");
        phone.setName("Samsung");
        phone.setModel("Galaxy S9");

        SmartWatch watch = new SmartWatch();
        watch.setBateria("200mah");
        watch.setPantalla("1.5");
        watch.setPulsera("pulsera");
        watch.setColor("azul");
        watch.setProcesador("Snapdragon 845");
        watch.setRam(2);
        watch.setAlmacenamiento("32gb");
        watch.setSO("Android 8.0");
        watch.setName("Samsung");
        watch.setModel("Galaxy Watch");

        System.out.println(phone.toString());
        System.out.println(watch.toString());
    }
}
