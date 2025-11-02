package academy.devdojo.maratonajava.javacore.LClassesAbstratas.Dominio;

public abstract class Funcionario {
    protected String nome;
    protected double salario;


    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        // quando se coloca o metodo direto no contrutor ele se executa sozinho
        calcularBonus();

    }

    public String toString(){
        return "Nome: "+nome + "Salario"+ salario;

    }
    public double calcularBonus(){
        return salario = salario + salario * 0.10;
    }

}
