package academy.devdojo.maratonajava.javacore.Minterfaces.Dominio;

public class FileLoader implements DataLoad{
    @Override
    public void load() {
        System.out.println("Carregando dados de um Arquivo");
    }
}
