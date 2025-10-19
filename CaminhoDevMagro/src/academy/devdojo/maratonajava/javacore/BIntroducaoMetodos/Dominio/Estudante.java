package academy.devdojo.maratonajava.javacore.BIntroducaoMetodos.Dominio;

public class Estudante {
    public String nome = "Zoro";
    public int idade;
    public char sexo;

    public void imprime(){
        System.out.println("______________________");

        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);

    }
}
