package academy.devdojo.maratonajava.javacore.DConstrutores.Teste;

import academy.devdojo.maratonajava.javacore.DConstrutores.Dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        // construtor e o primeiro metodo a ser executado
        Anime anime = new Anime("One Punch");
        anime.init("Dragn ball", "Tv", 20, "Shonem" );


        anime.imprime();
    }
}
