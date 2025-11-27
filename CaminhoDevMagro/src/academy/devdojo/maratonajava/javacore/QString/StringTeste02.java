package academy.devdojo.maratonajava.javacore.QString;

public class StringTeste02 {
    public static void main(String[] args) {
        String nome = "      Luffy    ";
        String numeros = "123456";
        System.out.println(nome.charAt(0));// retorna o nome por indice
        System.out.println(nome.length());// tamanho da string
        System.out.println(nome.replace("L", "f"));// trocar de Strings
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(numeros.length());
        System.out.println(numeros.substring(0, 2));
        System.out.println(nome.trim());// remove os espacos em branco no comeco e no fim

    }

}
