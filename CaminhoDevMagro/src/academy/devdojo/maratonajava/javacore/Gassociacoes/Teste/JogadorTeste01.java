package academy.devdojo.maratonajava.javacore.Gassociacoes.Teste;

import academy.devdojo.maratonajava.javacore.Gassociacoes.Dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacoes.Dominio.Time;

public class JogadorTeste01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pele");

        Time time = new Time("Palmeiras");

        jogador1.setTime(time);
        jogador1.imprime();



    }
}
