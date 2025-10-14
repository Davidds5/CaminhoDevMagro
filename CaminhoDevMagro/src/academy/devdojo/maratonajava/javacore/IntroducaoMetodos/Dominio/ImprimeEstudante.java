package academy.devdojo.maratonajava.javacore.IntroducaoMetodos.Dominio;

public class ImprimeEstudante {

    public void imprime(Estudante estudante){
        System.out.println("_______________");

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        estudante.nome = "trunks";
    }
}
