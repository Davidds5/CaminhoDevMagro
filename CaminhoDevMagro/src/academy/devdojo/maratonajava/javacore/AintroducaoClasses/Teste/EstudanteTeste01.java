package academy.devdojo.maratonajava.javacore.AintroducaoClasses.Teste;

import academy.devdojo.maratonajava.javacore.AintroducaoClasses.Dominio.Estudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Luffy";
        estudante.idade = 18;
        estudante.sexo = 'M';
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

    }
}
