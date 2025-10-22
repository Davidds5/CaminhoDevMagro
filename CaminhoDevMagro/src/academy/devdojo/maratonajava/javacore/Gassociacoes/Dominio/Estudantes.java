package academy.devdojo.maratonajava.javacore.Gassociacoes.Dominio;

public class Estudantes {
    private String nome;
    private int idade;
    private Seminarios seminarios;


    public Estudantes(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    public Estudantes(String nome, int idade, Seminarios seminarios) {
        this.nome = nome;
        this.idade = idade;
        this.seminarios = seminarios;
    }
    public void imprime(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+ this.idade);
        if (seminarios != null){
            System.out.println("Seminario: "+ seminarios.getNome());
        }else {
            System.out.println("Aluno nao esta em nenhum seminario !!");
        }
    }

    public Seminarios getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminarios seminarios) {
        this.seminarios = seminarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getIdade(){
        return  idade;
    }
}
