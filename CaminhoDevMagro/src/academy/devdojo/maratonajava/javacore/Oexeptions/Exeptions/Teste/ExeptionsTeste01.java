package academy.devdojo.maratonajava.javacore.Oexeptions.Exeptions.Teste;

import java.io.File;
import java.io.IOException;

public class ExeptionsTeste01 {
    public static void main(String[] args) throws IOException{
        criaNovoArquivo();

    }
    public static  void criaNovoArquivo()throws IOException{
        File file = new File("Arquivo\\texto.txt");
        try {
            boolean isCreat = file.createNewFile();
            System.out.println("Arquivo Criado: " + isCreat);
        }catch (IOException e){// catch e simplesmente criado para desenvolver excecoes, nao se pode usar regras de negocio aqui
            // nunca deixa essa parte em branco
            e.printStackTrace();
             throw new RuntimeException("Problema na hora de criar o arquivo");
            // para se usar o throw e preciso estancia ele la em cima

        }
    }
}
