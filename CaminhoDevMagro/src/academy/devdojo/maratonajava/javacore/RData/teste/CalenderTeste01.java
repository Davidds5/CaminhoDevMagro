package academy.devdojo.maratonajava.javacore.RData.teste;



import java.util.Calendar;
import java.util.Date;

public class CalenderTeste01 {
    public static void main(String[] args) {
        // class abstract
        Calendar c = Calendar.getInstance();
        if(c.getFirstDayOfWeek() == Calendar.SUNDAY){
            System.out.println("Domingo e o Primeiro dia semana");
        }
        System.out.println(c.get(Calendar.DAY_OF_WEEK));// dia da semana
        System.out.println(c.get(Calendar.DAY_OF_MONTH));// dia do mes
        System.out.println(c.get(Calendar.DAY_OF_YEAR));// dia do ano
        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));// dia da semana no mes
        Date date = c.getTime();
        System.out.println(c);
        System.out.println(date);

    }


}
