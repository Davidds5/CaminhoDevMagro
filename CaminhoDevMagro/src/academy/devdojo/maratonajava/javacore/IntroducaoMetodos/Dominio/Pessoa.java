package academy.devdojo.maratonajava.javacore.IntroducaoMetodos.Dominio;
// acomplamento e o quanto uma classe conhece da outra

// classe Pessoa e uma objeto

public class Pessoa {
    // atributos privados
    private String nome;
    private int idade;

    // pode usar o metodo imprimir criado agr
    // ou usar o metodo get com o sout para imprimir na tela
    public void imprimir(){
        System.out.println(this.nome);
        System.out.println(this.idade);
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    // se nao acrecentado o this, continuara 0, null
    public void setIdade(int idade){
        if (idade < 0){
            System.out.println("Idade invalida");
            return;
        }
       this.idade = idade;
    }


    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
}
