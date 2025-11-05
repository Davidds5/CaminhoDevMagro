package academy.devdojo.maratonajava.javacore.NPolimorfismo.Teste;

import academy.devdojo.maratonajava.javacore.NPolimorfismo.Dominio.Computador;
import academy.devdojo.maratonajava.javacore.NPolimorfismo.Dominio.Produto;
import academy.devdojo.maratonajava.javacore.NPolimorfismo.Dominio.Tomate;

public class ProdutoTeste02 {
    public static void main(String[] args) {
        Produto produto1 = new Computador("Ryzem 10", 8000);
        System.out.println(produto1.getNome());
        System.out.println(produto1.getValor());
        System.out.println(produto1.calcularImposto());

        System.out.println("___________________________________");
        Produto produto2 = new Tomate("Americano", 20);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());

    }
}
