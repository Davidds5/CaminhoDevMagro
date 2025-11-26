package academy.devdojo.maratonajava.javacore.Oexeptions.RumTime.Teste;

public class RumTimeExeptionsTeste02 {
    public static void main(String[] args) {
        System.out.println(Divisao(2, 0));
    }                                              // quando e do tipo runtime nao e necessario coloca esse aviso
    public static int Divisao(int a, int b){
        if(b==0){
            // maioria das vezes sera uma excecao do tipo runtime
            throw new IllegalArgumentException("Argumento ilegal, nao pode ser 0");
        }
        return 0;

    }
}
