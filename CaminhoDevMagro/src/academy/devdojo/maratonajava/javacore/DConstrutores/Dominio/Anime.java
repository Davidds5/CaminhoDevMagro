package academy.devdojo.maratonajava.javacore.DConstrutores.Dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int ep;
    private String genero;


    public Anime(String nome){
        System.out.println("dentro do constutor");
        this.nome = nome;
    }
    public void init(String nome, String tipo, int ep, String genero){
        this.nome = nome;
        this.tipo = tipo;
        this.ep = ep;
        this.genero = genero;

    }
    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.ep);
        System.out.println(this.genero);
    }

}
