package academy.devdojo.maratonajava.javacore.Hheranca.Dominio;

public class Funcionario extends Pessoa{
    private double salario;
    Pessoa pessoa;



    public Funcionario(String nome, double salario) {
        super(nome);
        this.salario = salario;
    }

    public Funcionario(String nome, String cpf, Endereco endereco, double salario) {
        super(nome, cpf, endereco);
        this.salario = salario;

    }

    @Override
    public void imprime() {
        super.imprime();
        System.out.println("Salario: "+this.salario);
    }

    public double getSalario() {
        return salario;
    }
}
