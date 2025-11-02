package academy.devdojo.maratonajava.javacore.LClassesAbstratas.Teste;

import academy.devdojo.maratonajava.javacore.LClassesAbstratas.Dominio.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.LClassesAbstratas.Dominio.Gerente;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Luis", 12000);
        System.out.println(gerente);

        // usando o tostring fazemos cada estancia ter suas proprias caracteristicas
        Desenvolvedor desenvolvedor = new Desenvolvedor("David", 18000);
        System.out.println(desenvolvedor);
    }
}
