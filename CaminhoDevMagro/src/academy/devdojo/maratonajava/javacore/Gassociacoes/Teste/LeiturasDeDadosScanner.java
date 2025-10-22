package academy.devdojo.maratonajava.javacore.Gassociacoes.Teste;

import java.util.Scanner;

public class LeiturasDeDadosScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        // next ler apenas a primeita palavra
        String nome = sc.next();

        sc.nextLine(); // consumindo a quebra de linha

        System.out.println("Digite novamente seu nome: ");
        // nextLine ler texto grande de qualquer tamanho
        String nome1 = sc.nextLine();


        System.out.println("Agr informe sua idade: ");
        // lendo apenas numeros inteiros
        int idade = sc.nextInt();

        System.out.println("Informe M ou F para o seu sexo: ");
        // char pega apenas a primeira letra do que vc escreveu
        char sexo = sc.next().charAt(0);

        System.out.println("______________________");
        System.out.println("Nome next: "+ nome);
        System.out.println("Nome: "+ nome1);
        System.out.println("idade: "+ idade);
        System.out.println("Sexo: (char): "+sexo);
    }
}
