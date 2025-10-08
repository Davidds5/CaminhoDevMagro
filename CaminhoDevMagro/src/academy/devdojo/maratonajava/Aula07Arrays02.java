package academy.devdojo.maratonajava;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        //String = null
        //char = \n000; ' '
        //double = false;
        String[] nomes = new String [3];
        nomes[0] = "Goku";
        nomes[1] = "Naruto";
        nomes[2] = "Luffy";



        for (int i = 0; i < nomes.length; i ++){
            System.out.println(nomes[i]);
        }
        nomes = new String [4];


    }
}
