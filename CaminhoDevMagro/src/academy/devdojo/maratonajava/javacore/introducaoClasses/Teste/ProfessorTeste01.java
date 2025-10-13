package academy.devdojo.maratonajava.javacore.introducaoClasses.Teste;

import academy.devdojo.maratonajava.javacore.introducaoClasses.Dominio.Professor;

public class ProfessorTeste01 {
    public static void main(String[] args) {

        Professor professor = new Professor();
        professor.nome = "Mestre Kami";
        professor.sexo = 'M';
        professor.idade = 140;

        System.out.println("Nome: " + professor.nome + ", Idade: "+professor.idade+", Sexo: "+ professor.sexo);
    }
}
