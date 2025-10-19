package academy.devdojo.maratonajava.javacore.BIntroducaoMetodos.Teste;

import academy.devdojo.maratonajava.javacore.BIntroducaoMetodos.Dominio.Pessoa;

public class PessoaTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        //      pessoa.nome = "Sanji";
        //     pessoa.idade = 23;

        pessoa.setNome("Irineu");
        pessoa.setIdade(20);

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());

    }
}
