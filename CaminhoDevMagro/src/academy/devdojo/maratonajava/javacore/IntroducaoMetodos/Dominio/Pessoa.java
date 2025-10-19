package academy.devdojo.maratonajava.javacore.IntroducaoMetodos.Dominio;
// acomplamento e o quanto uma classe conhece da outra

// classe Pessoa e uma objeto

public class Pessoa {
    // atributos privados
    private String nome;
    private int idade;

    public void imprimir(){
        System.out.println(this.nome);
        System.out.println(this.idade);
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    // se nao acrecentado o this, continuara 0, null
    public void setIdade(int idade){
       this.idade = idade;
    }
}
