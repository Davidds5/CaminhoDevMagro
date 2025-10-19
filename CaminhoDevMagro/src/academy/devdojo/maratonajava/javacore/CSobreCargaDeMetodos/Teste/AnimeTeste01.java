package academy.devdojo.maratonajava.javacore.CSobreCargaDeMetodos.Teste;

import academy.devdojo.maratonajava.javacore.CSobreCargaDeMetodos.Dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.setTipo("Tv");
        anime.setEp(21);

        anime.imprime();
    }
}
