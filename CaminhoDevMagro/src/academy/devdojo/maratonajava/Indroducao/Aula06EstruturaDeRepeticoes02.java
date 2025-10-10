package academy.devdojo.maratonajava.Indroducao;

public class Aula06EstruturaDeRepeticoes02 {
    public static void main(String[] args) {
        // imprima todos os numeros pares de 0 ate 1000

        for (int i = 0; i <1000 ; i++) {
            if (i % 2 == 0){
                System.out.println("Numero par: " + i);
            }
        }
    }
}
