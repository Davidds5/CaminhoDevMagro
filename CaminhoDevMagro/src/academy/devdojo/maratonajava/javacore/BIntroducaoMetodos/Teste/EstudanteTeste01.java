package academy.devdojo.maratonajava.javacore.BIntroducaoMetodos.Teste;

import academy.devdojo.maratonajava.javacore.BIntroducaoMetodos.Dominio.Estudante;
import academy.devdojo.maratonajava.javacore.BIntroducaoMetodos.Dominio.ImprimeEstudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImprimeEstudante imprimirEstudante = new ImprimeEstudante();

        estudante01.nome = "Deku";
        estudante01.idade = 15;
        estudante01.sexo = 'M';

        estudante02.nome = "Sakura";
        estudante02.idade = 21;
        estudante02.sexo = 'F';

        imprimirEstudante.imprime(estudante01);
        imprimirEstudante.imprime(estudante02);

        System.out.println("+++++++++++++++++++++++++++++++");

        imprimirEstudante.imprime(estudante01);
        imprimirEstudante.imprime(estudante02);

    }
}
