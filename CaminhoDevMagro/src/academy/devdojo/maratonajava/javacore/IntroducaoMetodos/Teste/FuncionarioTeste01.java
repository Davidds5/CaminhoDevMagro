package academy.devdojo.maratonajava.javacore.IntroducaoMetodos.Teste;

import academy.devdojo.maratonajava.javacore.IntroducaoMetodos.Dominio.Funcionario;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Kratos";
        funcionario.idade = 47;
        // pode se estancia diretamente
      //  funcionario.salarios = new double[]{2500, 1600, 1977};
        funcionario.imprimirDados();

    }
}
