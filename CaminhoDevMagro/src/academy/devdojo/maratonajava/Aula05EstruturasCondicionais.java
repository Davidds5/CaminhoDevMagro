package academy.devdojo.maratonajava;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {

        int idade = 20;
        boolean isAutorizadoComprarBebidas = idade >= 18;
        if (idade >= 18){
            System.out.println("Autorizado a comprar bebidas alcolicas");
        }

        if (!isAutorizadoComprarBebidas){
            System.out.println("Nao Autorizado a comprar bebidas alcolicas");
        }
        System.out.println("Fora do if");

    }
}
