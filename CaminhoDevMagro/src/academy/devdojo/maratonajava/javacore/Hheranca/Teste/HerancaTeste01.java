package academy.devdojo.maratonajava.javacore.Hheranca.Teste;

import academy.devdojo.maratonajava.javacore.Hheranca.Dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.Dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.Dominio.Pessoa;

public class HerancaTeste01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();// esse endereco e para pessoa
        endereco.setRua("Rua 3");
        endereco.setCep("11111-111");


        // cada uma dessas classes representa um objeto na memoria
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("David");
        pessoa.setCpf("12345678");
        pessoa.setEndereco(endereco);
        pessoa.imprime();



        // heranca faz eu conseguir usar os atributos da class pessoa
        Funcionario funcionario = new Funcionario();
        funcionario.setSalario(1200);
        funcionario.setEndereco(endereco);
        funcionario.setCpf("87654321");
        funcionario.setNome("Luis");
        endereco.setRua("Rua dos flamingos");// esse endereco e apenas de funcionario
        endereco.setCep("2222-22");
        System.out.println("________________");

        funcionario.imprime();

    }
}
