package academy.devdojo.maratonajava.javacore.Gassociacoes.Teste;

import academy.devdojo.maratonajava.javacore.Gassociacoes.Dominio.Escola;
import academy.devdojo.maratonajava.javacore.Gassociacoes.Dominio.Professor;

public class EscolaTeste01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Konohamaru");
        Professor professor2 = new Professor("Jiraya");
        Professor[] professors = {professor1, professor2};
        Escola escola = new Escola("Konoha", professors);
        escola.imprime();
    }
}
