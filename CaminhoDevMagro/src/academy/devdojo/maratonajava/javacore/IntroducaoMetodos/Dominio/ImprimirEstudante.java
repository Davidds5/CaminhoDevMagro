package academy.devdojo.maratonajava.javacore.IntroducaoMetodos.Dominio;

public class ImprimirEstudante {

    public void imprimir(Estudante estudante){
        System.out.println("_______________");

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
