package academy.devdojo.maratonajava.javacore.IntroducaoMetodos.Teste;

import academy.devdojo.maratonajava.javacore.IntroducaoMetodos.Dominio.Pessoa;

public class PessoaTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

  //      pessoa.nome = "Sanji";
   //     pessoa.idade = 23;

        pessoa.setNome("Irineu");
        pessoa.setIdade(20);

        pessoa.imprimir();
    }

}
