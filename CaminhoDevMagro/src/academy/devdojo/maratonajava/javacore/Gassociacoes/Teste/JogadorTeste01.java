package academy.devdojo.maratonajava.javacore.Gassociacoes.Teste;

import academy.devdojo.maratonajava.javacore.Gassociacoes.Dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacoes.Dominio.Time;

public class JogadorTeste01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pele");
        Jogador jogador2 = new Jogador("Messi");
        Time time = new Time("Palmeiras");
        Jogador[] jogadors = {jogador1, jogador2};


        time.setJogadors(jogadors);
        jogador1.setTime(time);
        jogador2.setTime(time);
        System.out.println("___JOGADORES___");
        jogador1.imprime();
        System.out.println("___TIMES___");
        time.imprime();



    }
}
