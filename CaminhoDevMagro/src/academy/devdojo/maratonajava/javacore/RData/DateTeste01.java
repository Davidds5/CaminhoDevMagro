package academy.devdojo.maratonajava.javacore.RData;

import java.util.Date;

public class DateTeste01 {
    public static void main(String[] args) {
        // usando date em java
        Date date = new Date(10000000);// date e um long

        System.out.println(date.getTime());// ira imprimir o long que representa aquela data
        date.setTime(date.getTime() + 3_600_00);// representa o aumento de 1 hora
        System.out.println(date);
    }
}
