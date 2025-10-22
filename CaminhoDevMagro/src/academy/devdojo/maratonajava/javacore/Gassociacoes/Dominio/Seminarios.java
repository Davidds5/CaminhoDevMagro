package academy.devdojo.maratonajava.javacore.Gassociacoes.Dominio;

public class Seminarios {
    private String nome;
    private  Local local;
    private Estudantes[] estudantes;
    private Professores professors;

    // Seminario podera ter 1 ou varios estudantes
    // sera criado um construtor com estudantes e um sem estudantes.
    public Seminarios(String nome) {
        this.nome = nome;
    }

    public Seminarios(String nome,Local local, Estudantes[] estudantes, Professores professor) {
        this.nome = nome;
        this.local = local;
        this.estudantes = estudantes;
        this.professors = professor;
    }


    public void imprime(){
        System.out.println("Nome do Seminario: "+this.nome);
        if (local != null){
            System.out.println("Local: "+ local.getNome());
        }
        if (professors != null){
            System.out.println("Professor: "+professors.getNome());
        }
        if (estudantes != null && estudantes.length > 0){
            System.out.println("____Estudantes____");
            for (Estudantes estudantes1 : estudantes){
                System.out.println("Nome: "+estudantes1.getNome() + "| Idade: "+estudantes1.getIdade());
            }
        }
        else {
            System.out.println("Nenhum estudante cadrastado !!");
        }
        System.out.println("______________________________________");
    }
    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Professores getProfessor() {
        return professors;
    }

    public void setProfessor(Professores professor) {
        this.professors = professor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Estudantes[] getEstudantes() {
        return estudantes;
    }

    public void setEstudantes(Estudantes[] estudantes) {
        this.estudantes = estudantes;
    }
}
