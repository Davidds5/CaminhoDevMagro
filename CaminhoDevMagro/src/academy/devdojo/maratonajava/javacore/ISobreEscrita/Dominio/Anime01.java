package academy.devdojo.maratonajava.javacore.ISobreEscrita.Dominio;

public class Anime01 extends Object{
    private String nome;

    public Anime01(String nome) {
        this.nome = nome;
    }

    public String toString(){
        return "Nome Anime: "+this.nome;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
