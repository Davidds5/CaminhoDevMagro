package academy.devdojo.maratonajava.javacore.LClassesAbstratas.Dominio;

public class Gerente extends Funcionario{
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "Gerente Nome: "+nome+" | Salario: "+salario;
    }


}
