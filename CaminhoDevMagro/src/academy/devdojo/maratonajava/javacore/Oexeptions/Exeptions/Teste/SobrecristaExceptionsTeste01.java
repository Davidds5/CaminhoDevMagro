package academy.devdojo.maratonajava.javacore.Oexeptions.Exeptions.Teste;

import academy.devdojo.maratonajava.javacore.Oexeptions.Exeptions.Dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Oexeptions.Exeptions.Dominio.LoginInvalidoExeptions;
import academy.devdojo.maratonajava.javacore.Oexeptions.Exeptions.Dominio.Pessoa;

import java.io.FileNotFoundException;
import java.io.IOException;

public class SobrecristaExceptionsTeste01 {
    public static void main(String[] args)  {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        // se for usado a exceptions no metodo, logo e obrigado a usar e exceptions aqui
        try {
            funcionario.salvar();
        } catch (LoginInvalidoExeptions | IOException e) {
            throw new RuntimeException(e);
        }
    }

}
