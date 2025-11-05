package academy.devdojo.maratonajava.javacore.NPolimorfismo.Teste;

import academy.devdojo.maratonajava.javacore.NPolimorfismo.Repositorio.Repositorio;
import academy.devdojo.maratonajava.javacore.NPolimorfismo.Servico.RepositorioArquivo;
import academy.devdojo.maratonajava.javacore.NPolimorfismo.Servico.RepositorioBancoDeDados;

import java.util.ArrayList;
import java.util.List;

public class RepositorioTeste01 {
    public static void main(String[] args) {

        // apenas mudando a istancia, sem modifica o metodo salvar \
        // implementacao
        Repositorio repositorio = new RepositorioArquivo();
        repositorio.salvar();
        List<String> nomes = new ArrayList<>();
        nomes.add("Mydoria");
        nomes.add("Goku");
        nomes.add("Sanji");
        nomes.add("Zoro");
        for (String nome : nomes){
            System.out.println(nome);
        }



    }
}
