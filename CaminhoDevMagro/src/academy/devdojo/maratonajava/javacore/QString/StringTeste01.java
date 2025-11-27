package academy.devdojo.maratonajava.javacore.QString;

public class StringTeste01 {
    public static void main(String[] args) {

        // Strings sao imutaveis
        String nome = "David";
        String nome2 = "David";
        nome =  nome.concat(" Silva"); // nome += " Silva"
        System.out.println(nome);
        System.out.println(nome == nome2);

        // 1 uma variavel de referencia, 2 um objeto do tipo string, 3 uma string poo
        String nome3 = new String("David"); // quando se faz assim esta sendo criada em outro lugar
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());
    }
}
