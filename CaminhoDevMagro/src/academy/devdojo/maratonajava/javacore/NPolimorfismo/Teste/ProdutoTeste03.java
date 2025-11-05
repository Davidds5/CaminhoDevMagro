package academy.devdojo.maratonajava.javacore.NPolimorfismo.Teste;

import academy.devdojo.maratonajava.javacore.NPolimorfismo.Dominio.Computador;
import academy.devdojo.maratonajava.javacore.NPolimorfismo.Dominio.Produto;
import academy.devdojo.maratonajava.javacore.NPolimorfismo.Dominio.Tomate;
import academy.devdojo.maratonajava.javacore.NPolimorfismo.Servico.CalculadoraImposto;

public class ProdutoTeste03 {
    public static void main(String[] args) {
        Produto produto1 = new Computador("Ryzem 10", 8000);


        // para se usar metodos da class em objeto e necessario estancia ela diretamente pelo objeto de referencia em questao
        Tomate tomate = new Tomate("Americano", 20);
        tomate.setDataValidade("10/11/2026");


        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("___________________");
        CalculadoraImposto.calcularImposto(produto1);

    }
}
