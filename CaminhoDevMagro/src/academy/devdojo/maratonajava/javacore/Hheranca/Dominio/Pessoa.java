package academy.devdojo.maratonajava.javacore.Hheranca.Dominio;

public class Pessoa {
    private String nome;
    private String cpf;
    private Endereco endereco;


    public void imprime(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Cpf: "+this.cpf);
        System.out.println("Cep: "+this.getEndereco().getCep()+"| Rua: "+getEndereco().getRua());
    }
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
