package academy.devdojo.maratonajava.javacore.Gassociacoes.Dominio;

public class Professores {
    private String nome;
    private String especialidade;
    private Seminarios[] seminarios;


    public Professores(String nome, String especialidade ){
        this.nome = nome;
        this.especialidade = especialidade;
    }
    public Professores(String nome, Seminarios[] seminarios, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public void imprime(){
        System.out.println("Nome: "+this.nome + "| Especialidade: "+especialidade);
        if(seminarios == null)return;
        for (Seminarios seminarios1 : seminarios){
            System.out.println("Seminario: "+seminarios1.getNome());
        }

    }

    public Seminarios[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminarios[] seminarios) {
        this.seminarios = seminarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
