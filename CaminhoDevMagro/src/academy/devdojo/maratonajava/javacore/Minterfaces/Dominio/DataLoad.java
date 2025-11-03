package academy.devdojo.maratonajava.javacore.Minterfaces.Dominio;

public interface DataLoad {
    final int MAx_Data_Size = 10;



    // o java ja sabe que o metodo e public e abstract
    public abstract void load();

    default void checkPermission(){
        System.out.println("Fazendo checagem de permissao");
    }
    public static void retrieveMaxDataSize(){
        System.out.println("Dentro da Interface");
    }

}
