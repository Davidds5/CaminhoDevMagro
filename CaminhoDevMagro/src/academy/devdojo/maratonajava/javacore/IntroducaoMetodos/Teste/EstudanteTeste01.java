package academy.devdojo.maratonajava.javacore.IntroducaoMetodos.Teste;

import academy.devdojo.maratonajava.javacore.IntroducaoMetodos.Dominio.Estudante;
import academy.devdojo.maratonajava.javacore.IntroducaoMetodos.Dominio.ImprimirEstudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImprimirEstudante imprimirEstudante = new ImprimirEstudante();

        estudante01.nome = "Deku";
        estudante01.idade = 15;
        estudante01.sexo = 'M';


        estudante02.nome = "Sakura";
        estudante02.idade = 21;
        estudante02.sexo = 'F';




        imprimirEstudante.imprimir(estudante01);
        imprimirEstudante.imprimir(estudante02);
    }
}
