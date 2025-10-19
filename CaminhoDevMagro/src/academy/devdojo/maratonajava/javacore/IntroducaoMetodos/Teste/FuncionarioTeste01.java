package academy.devdojo.maratonajava.javacore.IntroducaoMetodos.Teste;

import academy.devdojo.maratonajava.javacore.IntroducaoMetodos.Dominio.Funcionario;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Meliodas ");
        funcionario.setIdade(20);
        funcionario.setSalarios(new double[]{2000, 1800, 900});
        // pode se estancia diretamente
      //  funcionario.salarios = new double[]{2500, 1600, 1977};
        funcionario.imprimirDados();
        System.out.println();
        System.out.println("Media: "+funcionario.getMedia());

    }
}
