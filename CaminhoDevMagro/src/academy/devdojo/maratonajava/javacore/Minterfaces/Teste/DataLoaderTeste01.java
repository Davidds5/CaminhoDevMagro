package academy.devdojo.maratonajava.javacore.Minterfaces.Teste;

import academy.devdojo.maratonajava.javacore.Minterfaces.Dominio.DataBaseLoader;
import academy.devdojo.maratonajava.javacore.Minterfaces.Dominio.FileLoader;

public class DataLoaderTeste01 {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        dataBaseLoader.load();

        FileLoader fileLoader = new FileLoader();
        fileLoader.load();
    }
}
