package academy.devdojo.maratonajava.javacore.DConstrutores.Teste;

import academy.devdojo.maratonajava.javacore.DConstrutores.Dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        // construtor e o primeiro metodo a ser executado
        Anime anime = new Anime("One Punch", "Manga", 20, "Porradaria", "Studio Api");
        // sobrecarga de metodos

        anime.imprime();

    }
}
