package academy.devdojo.maratonajava.javacore.BIntroducaoMetodos.Teste;

import academy.devdojo.maratonajava.javacore.BIntroducaoMetodos.Dominio.Calculadora;

public class CalculadoraTeste04 {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        int numero1 = 10;
        int numero2 = 20;

        // as variaves do void nao mudam por conta da declaracao aqui
        calculadora.mudarDoisNumeros(numero1, numero2);
        System.out.println("Dentro de calculadora Teste");
        // e as variaveis daqui nao mudam pq da declaracao no void
        System.out.println("Numero: " + numero1);
        System.out.println("Numero: " + numero2);



    }
}
