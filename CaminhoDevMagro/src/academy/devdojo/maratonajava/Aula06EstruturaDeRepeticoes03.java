package academy.devdojo.maratonajava;

public class Aula06EstruturaDeRepeticoes03 {
    // imprima os primeiros 25 numeros de um dado valor, por exemplo, 50
    public static void main(String[] args) {

        int valorMax =50;

        for (int i = 0; i <valorMax ; i++) {
            if (i > 25){
                break;
            }
            System.out.println(i);

        }
    }
}
