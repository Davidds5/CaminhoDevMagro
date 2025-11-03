package academy.devdojo.maratonajava.javacore.NPolimorfismo.Dominio;

public class Computador extends Produto {
    // cada produto tera uma taxacao unica
    public static final double IMPOSTO_POR_CENTO = 0.21;

    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Imposto do computador");
        return this.valor * IMPOSTO_POR_CENTO;
    }
}
