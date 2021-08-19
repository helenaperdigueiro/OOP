package aula06.impressora;

import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Impressora impressora1 = new Impressora("Epson", "wifi", LocalDate.of(2014, 9, 15), 100);
        System.out.println(impressora1.getDataFabricacao());
        impressora1.imprimir("Ola Mundo!");
    }
}
