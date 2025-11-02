package academy.devdojo.maratonajava.javacore.LClassesAbstratas.Dominio;

public class Desenvolvedor extends Funcionario{

    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "Desenvolvedor Nome: "+nome+" | Salario: "+salario;
    }

    @Override
    public double calcularBonus() {
        return salario = this.salario + this.salario *0.05;
    }


}
