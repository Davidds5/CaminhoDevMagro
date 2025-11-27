package academy.devdojo.maratonajava.javacore.QString;

public class StringBuilderTeste01 {
    public static void main(String[] args) {
        String nome = "David Silva";
        nome.concat("Clovim Programacao");

        nome.substring(0, 3);// nao e assim que se gera uma string
        nome = nome.substring(0, 2);// e assim que se faz
        System.out.println(nome);

        StringBuilder sb = new StringBuilder("David Silva");
        sb.append(" clovim ").append("Programacao");
        System.out.println(sb);// a String builder ja vem com o toString
        sb.reverse();
        System.out.println(sb);
    }
}
