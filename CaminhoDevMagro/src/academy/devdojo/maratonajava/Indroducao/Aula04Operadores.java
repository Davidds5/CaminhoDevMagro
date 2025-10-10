package academy.devdojo.maratonajava.Indroducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero02 / (double) numero01;
        System.out.println(resultado);

        // % resto
        int resto = 21 % 7;
        System.out.println(resto);

        // < > <= >= == !=

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDesDiferenteDez = 10 != 10;

        System.out.println("isDezMaiorQueVinte: " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte: " + isDezMenorQueVinte);
        System.out.println("isDezIgualVinte: " + isDezIgualVinte);
        System.out.println("isDezIgualDez: " + isDezIgualDez);
        System.out.println("isDezDiferenteDez: " + isDesDiferenteDez);

        // && (AND) || (or) !

        int idade = 29;
        float salario = 3500f;
        boolean isDentroDaleiMaiorQueTrinta = idade > 38 && salario >= 4612;
        boolean isDentroDaleiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaleiMaiorQueTrinta: " + isDentroDaleiMaiorQueTrinta);
        System.out.println("isDentroDaleiMenorQueTrinta: " + isDentroDaleiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;

        System.out.println("isPlaystationCincoCompravel: "+isPlaystationCincoCompravel);

        double salarioBonus = 1000;
        salarioBonus = salarioBonus + 1000;
        salarioBonus *=2;
        salarioBonus /= 2;
        salarioBonus %= 2;
        System.out.println(salarioBonus);

        int contador = 0;
        contador += 1;
        contador ++;
        contador --;
        ++ contador;
        --contador;
        System.out.println(contador);
        int contador2 = 0;
        System.out.println(contador2);

    }
}
