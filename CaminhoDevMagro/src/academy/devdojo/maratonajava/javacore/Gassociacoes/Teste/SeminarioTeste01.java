package academy.devdojo.maratonajava.javacore.Gassociacoes.Teste;

import academy.devdojo.maratonajava.javacore.Gassociacoes.Dominio.Estudantes;
import academy.devdojo.maratonajava.javacore.Gassociacoes.Dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacoes.Dominio.Professores;
import academy.devdojo.maratonajava.javacore.Gassociacoes.Dominio.Seminarios;


public class SeminarioTeste01 {
    public static void main(String[] args) {
        Local local = new Local("Rua ilha dos Ratones");
        Estudantes estudantes1 = new Estudantes("David", 21 );
        Estudantes estudantes2 = new Estudantes("Luis", 25);

        Professores professores = new Professores("Konohamaru", "Taijust");

        Seminarios seminarios = new Seminarios("Introducao a logica", local, new Estudantes[]{estudantes1, estudantes2},professores );

        seminarios.imprime();


    }
}
