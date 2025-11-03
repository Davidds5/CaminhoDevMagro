package academy.devdojo.maratonajava.javacore.NPolimorfismo.Servico;

import academy.devdojo.maratonajava.javacore.NPolimorfismo.Dominio.Computador;
import academy.devdojo.maratonajava.javacore.NPolimorfismo.Dominio.Tomate;

public class CalculadoraImposto {
    public void calcularImposto(Computador computador){
        System.out.println("Relatorio de imposto do computador");
        double imposto = computador.calcularImposto();
        System.out.println("Computador: "+computador.getNome());
        System.out.println("Valor: "+computador.getValor());
        System.out.println("Imposto a ser pago: "+imposto);

    }
    public void calcularImposto(Tomate tomate){
        System.out.println("Relatorio de imposto do tomate");
        double imposto = tomate.calcularImposto();
        System.out.println("Computador: "+tomate.getNome());
        System.out.println("Valor: "+tomate.getValor());
        System.out.println("Imposto a ser pago: "+imposto);

    }
}
