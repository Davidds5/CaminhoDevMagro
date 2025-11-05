package academy.devdojo.maratonajava.javacore.NPolimorfismo.Servico;

import academy.devdojo.maratonajava.javacore.NPolimorfismo.Dominio.Computador;
import academy.devdojo.maratonajava.javacore.NPolimorfismo.Dominio.Produto;
import academy.devdojo.maratonajava.javacore.NPolimorfismo.Dominio.Tomate;

// quando nao estamos acessando os atributos de classes nos podemos transforma os nossos metodos em static
public class CalculadoraImposto {
// Metodo generico
    public static void calcularImposto(Produto produto){
        System.out.println("Relatorio de Impostos");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: "+ produto.getNome());
        System.out.println("Valor: "+ produto.getValor());
        System.out.println("Imposto a ser pago: "+ imposto);
    }
}
