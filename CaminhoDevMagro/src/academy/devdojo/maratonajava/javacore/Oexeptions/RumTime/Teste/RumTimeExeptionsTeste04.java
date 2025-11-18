package academy.devdojo.maratonajava.javacore.Oexeptions.RumTime.Teste;

import javax.annotation.processing.FilerException;
import java.io.FileNotFoundException;
import java.sql.SQLData;
import java.sql.SQLException;

// usando multiplas excecoes!
// Expressoes mais gerenricas sempre tem que ir no final, se nao as outras expressoes filhas nao
// serão ultilizadas
public class RumTimeExeptionsTeste04 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        }catch (ArrayIndexOutOfBoundsException |IllegalArgumentException | ArithmeticException e){
            System.out.println("Dentro do  ArrayIndexOutOfBoundsException |IllegalArgumentException | ArithmeticException e");
        }catch (RuntimeException e ) {
            System.out.println("Dentro do RuntimeException");
        }
            try{
                talvesLanceExcptions();
            } catch (SQLException | FileNotFoundException exception) {
                exception.printStackTrace();

            }
    }
    public static void talvesLanceExcptions() throws SQLException, FileNotFoundException{

    }
}



