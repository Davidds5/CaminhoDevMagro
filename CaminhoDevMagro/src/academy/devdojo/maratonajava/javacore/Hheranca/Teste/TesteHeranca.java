package academy.devdojo.maratonajava.javacore.Hheranca.Teste;

import academy.devdojo.maratonajava.javacore.Hheranca.Dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.Dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.Dominio.Pessoa;

import javax.xml.stream.events.EndElement;

public class TesteHeranca {
    public static void main(String[] args) {
        Endereco endereco01 = new Endereco("Rua dos Flamingos", "1111-22");
        Pessoa pessoa = new Pessoa("Luis", "1111111", endereco01);
        pessoa.imprime();
        System.out.println("________________");


        Endereco endereco02 = new Endereco("Rua dos ratones", "2222-11");
        Funcionario funcionario = new Funcionario("Felipe", "22222",endereco02,  1200);

        funcionario.imprime();
    }
}
