package academy.devdojo.maratonajava.javacore.Minterfaces.Dominio;

// pode ser feita a implementacao de multiplas interfaces
public class DataBaseLoader implements DataLoad, DataRemove {
// private -> default -> protect -> public
    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");
    }

    @Override
    public void remove(){
        System.out.println("Removendo do banco de dados");

    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permisssoes no banco de dados");
    }
}
