package academy.devdojo.maratonajava.javacore.IntroducaoMetodos.Dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprimirDados() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        if(salarios != null) {
            for (Double salario : salarios) {
                System.out.print(salario + ", ");
            }
        }
        mediaSalario();
    }
    public void mediaSalario(){
        if (salarios == null){
            return;
        }
        double media = 0;
        for (double salario : salarios){
            media += salario;


        }
        media /= salarios.length;
        System.out.print("\nMedia salarial 2f: "+media);
    }

}
