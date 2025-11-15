package academy.devdojo.maratonajava.javacore.Oexeptions.Error.Teste;

public class StackOverFlowTeste01 {
    public static void main(String[] args) {
        recursividade();
    }
    public static void recursividade(){
        recursividade();
    }
}
