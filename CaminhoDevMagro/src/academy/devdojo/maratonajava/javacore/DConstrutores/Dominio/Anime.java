package academy.devdojo.maratonajava.javacore.DConstrutores.Dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int ep;
    private String genero;
    private String studio;


    public Anime(String nome,String tipo, int ep, String genero) {
        this();
        this.nome = nome;
        this.tipo = tipo;
        this.ep = ep;
        this.genero = genero;
    }

    public Anime(String nome,String tipo, int ep, String genero, String studio){
        this(nome, tipo, ep, genero);// precisa ser a primeira linha executavel
        this.studio = studio;

    }
    public Anime(){
        System.out.println("Segundo construtor");

    }


    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.ep);
        System.out.println(this.genero);
        System.out.println(this.studio);
    }

}
