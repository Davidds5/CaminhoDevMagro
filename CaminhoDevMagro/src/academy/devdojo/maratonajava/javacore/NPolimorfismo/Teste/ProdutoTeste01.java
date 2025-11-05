package academy.devdojo.maratonajava.javacore.NPolimorfismo.Teste;

import academy.devdojo.maratonajava.javacore.NPolimorfismo.Dominio.Computador;
import academy.devdojo.maratonajava.javacore.NPolimorfismo.Dominio.Tomate;
import academy.devdojo.maratonajava.javacore.NPolimorfismo.Servico.CalculadoraImposto;

public class ProdutoTeste01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NCU10i7", 12000);
        Tomate tomate = new Tomate("Tomate Siciliando", 10);

        System.out.println("___________________________________");
        CalculadoraImposto.calcularImpostoComputador(computador);
        CalculadoraImposto.calcularImpostoTomate(tomate);
    }
}
