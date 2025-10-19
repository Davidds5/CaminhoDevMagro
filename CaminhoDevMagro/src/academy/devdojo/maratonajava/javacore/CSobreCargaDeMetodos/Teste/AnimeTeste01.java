package academy.devdojo.maratonajava.javacore.CSobreCargaDeMetodos.Teste;

import academy.devdojo.maratonajava.javacore.CSobreCargaDeMetodos.Dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        // sobrecarga de metodos
        anime.init("Boku no hero", "Tv", 20);
        anime.init("Boku no hero", "Tv", 20, "Shonem");



        anime.imprime();
    }
}
