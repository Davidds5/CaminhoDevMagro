package academy.devdojo.maratonajava.javacore.Hheranca.Teste;

import academy.devdojo.maratonajava.javacore.Hheranca.Dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.Dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.Dominio.Pessoa;

public class HerancaTeste01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("11111-111");

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


        funcionario.imprime();

    }
}
