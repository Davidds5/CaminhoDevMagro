package academy.devdojo.maratonajava;

public class Aula05EstruturasCondicionais2 {
    public static void main(String[] args) {
        // idade < 15 categoria infantil
        // idade >= 15 && idade < 18 categoria juvenil
        // idade >= 18 categoria adulto

        int idade = 17;
        if (idade < 15){
            System.out.println("Categoria infantil.");
        }else if (idade >= 15 && idade < 18 ){
            System.out.println("Categoria juvenil.");
        } else if (idade >= 18) {
            System.out.println("Categoria adulto");
        }else {
            System.out.println("Categoria Idoso.");
        }
    }
}
