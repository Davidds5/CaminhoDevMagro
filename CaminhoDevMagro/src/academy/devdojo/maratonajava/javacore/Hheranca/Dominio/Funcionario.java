package academy.devdojo.maratonajava.javacore.Hheranca.Dominio;

public class Funcionario extends Pessoa {
    public double salario;


    // nao e preciso colocar o imprime aqui pois ja foi herdado de pessoa
    public double getSalario() {
        return salario;
    }
    public void imprime(){
        super.imprime();// metodo para imprimir primeiro os souts da class Pessoa
        System.out.println("Salario: "+this.salario);
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
