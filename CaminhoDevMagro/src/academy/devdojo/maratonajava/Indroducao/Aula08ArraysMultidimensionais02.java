package academy.devdojo.maratonajava.Indroducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int [][] arraysInt = new int[3][];

        arraysInt[0] = new int[2];
        arraysInt[1] = new int[]{2, 4, 6};
        arraysInt[2] = new int[]{1, 2, 3,4 ,5 ,6} ;

        // array com diferentes posicoes
        int[][] arrayInt2 = {{0,0},{1,2,3},{1,2,3,4,5,6}};

        for (int[] arrayBase: arrayInt2){
            System.out.println("\n _____");
            for (int num : arrayBase){
                System.out.print(num + " ");
            }
        }
    }
}
