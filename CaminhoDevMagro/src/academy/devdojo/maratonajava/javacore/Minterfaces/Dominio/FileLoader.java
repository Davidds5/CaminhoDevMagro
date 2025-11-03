package academy.devdojo.maratonajava.javacore.Minterfaces.Dominio;

import javax.xml.crypto.Data;

public class FileLoader implements DataLoad, DataRemove {
    @Override
    public void load() {
        System.out.println("Carregando dados de um Arquivo");
    }

    @Override
    public void remove() {
        System.out.println("Deletando dados de um arquivo");

    }

    @Override
    public void checkPermission() {
        System.out.println("Permissoes nos arquivos ");
    }
}
