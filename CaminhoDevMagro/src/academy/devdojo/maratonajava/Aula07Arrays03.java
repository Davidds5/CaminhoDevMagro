package academy.devdojo.maratonajava;

public class Aula07Arrays03 {
    public static void main(String[] args) {

        int[] numeros = new int[3];
        int[] numeros2 = {1,2,3,4,5};
        int[] numeros3 = new int[]{1,2,3,4,5};
/*        for (int i = 0; i < numeros2.length; i++) {
            System.out.println(numeros2[i]);

       }*/

        // int num nao e uma variavel local, entao pode estancia ela depois do uso no for
        for (int num:numeros3){
            System.out.println(num);
        }
        int num;
    }
}
