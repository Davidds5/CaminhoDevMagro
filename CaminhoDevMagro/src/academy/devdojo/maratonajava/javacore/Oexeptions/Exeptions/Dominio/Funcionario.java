package academy.devdojo.maratonajava.javacore.Oexeptions.Exeptions.Dominio;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Funcionario extends Pessoa {

    // nao se pode usar classes mais genericas que a extends da classe Pessoa
    // funcoes do tipo runTime nao forca vc a fazer o tratamento
    public void salvar() throws LoginInvalidoExeptions, IOException {
        System.out.println("Salvando funcionario");
    }
}
