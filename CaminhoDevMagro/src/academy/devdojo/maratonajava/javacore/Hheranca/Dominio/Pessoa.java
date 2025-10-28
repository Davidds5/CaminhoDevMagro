package academy.devdojo.maratonajava.javacore.Hheranca.Dominio;

public class Pessoa {
    private String nome;
    private String cpf;
    private Endereco endereco;


    // se existe um construtor na class mae, obrigatoriamente tera que existi nas classes filhas
    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa(String nome, String cpf, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }
    public void imprime(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Cpf: "+this.cpf);
        if (endereco != null){
            System.out.println("Endereco Rua: "+this.endereco.getRua()+ "| Cep: "+this.endereco.getCep());
        }else{
            System.out.println("Nenhum endereco cadrastado!");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
