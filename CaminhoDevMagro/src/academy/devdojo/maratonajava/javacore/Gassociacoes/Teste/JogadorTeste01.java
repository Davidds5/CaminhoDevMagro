package academy.devdojo.maratonajava.javacore.Gassociacoes.Teste;

import academy.devdojo.maratonajava.javacore.Gassociacoes.Dominio.Jogador;

public class JogadorTeste01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pele");
        Jogador jogador2 = new Jogador("Maradona");
        Jogador jogador3 = new Jogador("Messi");
        Jogador jogador4 = new Jogador("CR7");

        Jogador[] jogadors = {jogador1, jogador2, jogador3, jogador4};

        for (Jogador jogador : jogadors){
            jogador.imprime();
        }
    }
}
