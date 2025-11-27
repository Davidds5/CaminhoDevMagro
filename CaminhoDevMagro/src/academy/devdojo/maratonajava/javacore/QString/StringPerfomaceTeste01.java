package academy.devdojo.maratonajava.javacore.QString;

public class StringPerfomaceTeste01 {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();// mostrando o tempo
        concatString(10000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para String "+ (fim - inicio)+"ms");


        // bem mais rapido
        long inicio1 = System.currentTimeMillis();// mostrando o tempo
        concatStringBuilder(10_000_00);
        long fim1 = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBuilder "+ (fim1 - inicio1)+"ms");

        inicio1 = System.currentTimeMillis();// mostrando o tempocon(20000);
        concatStringBuffer(10_000_00);
        fim1 = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBuffer "+ (fim1 - inicio1)+"ms");


    }

    public static void concatString(int tamanho){
        String texto = "";
        for (int i = 0; i < tamanho ; i++) {
            texto += i;

        }
    }
    public static void concatStringBuilder(int tamanho){
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i <tamanho; i++) {
            sb.append(i);

        }
    }
    // praticamente a mesma coisa
    public static void concatStringBuffer(int tamanho){
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i <tamanho; i++) {
            sb.append(i);

        }
    }
}
