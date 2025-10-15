package academy.devdojo.maratonajava.javacore.IntroducaoMetodos.Dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salario;

    public void imprimirDados() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.salario);
    }

}
