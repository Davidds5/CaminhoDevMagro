package academy.devdojo.maratonajava.javacore.PWrapper.test;

import org.w3c.dom.ls.LSOutput;

public class WrapperTeste01 {
    public static void main(String[] args) {
        // tipos primitivos
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 10d;
        char charP = 'P';
        boolean booleanP = false;

        // Objetos, nao sao mais tipos primitivos
        Byte byteW= 1;
        Short shortW = 1;
        Integer intW = 1; // autoboxing
        Long longW= 10L;
        Float floatW = 10F;
        Double doubleW = 10d;
        Character charW = 'P';
        Boolean booleanW  = false;

        int i = intW;  // unboxing
        Integer intW2 = Integer.parseInt("1");
        boolean verdadeiro =  Boolean.parseBoolean("FAlse");
        System.out.println(verdadeiro);

        System.out.println(Character.isDigit('a'));
        System.out.println(Character.isDigit('a'));
        System.out.println(Character.isLetterOrDigit('!'));
        System.out.println(Character.isUpperCase('a'));
        System.out.println(Character.isLowerCase('a'));
        System.out.println(Character.toLowerCase('A'));
        System.out.println(Character.toUpperCase('a'));

    }

}
