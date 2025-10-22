package academy.devdojo.maratonajava.javacore.Gassociacoes.Teste;

import java.util.Scanner;

public class LeituraDoTecladoTeste02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("O Grande software de previsao do futuro");
        System.out.println("Digite sua pergunta e eu responmderei sim ou nao");
        String pergunta = sc.nextLine();

        if (pergunta.charAt(0) == ' '){
            System.out.println("SIM");
        }else {
            System.out.println("NAO ");
        }

    }
}
