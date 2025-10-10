package academy.devdojo.maratonajava.Indroducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionais5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Masculino(M) ou Feminino(F): ");
        char nome = sc.next().charAt(0);

        switch (nome){
            case 'M':
                System.out.println("Voce e Homem");
                break;
            case 'F':
                System.out.println("Voce e Mulher.");
                break;

            default:
                System.out.println("Op invalida");
        }


    }
}
