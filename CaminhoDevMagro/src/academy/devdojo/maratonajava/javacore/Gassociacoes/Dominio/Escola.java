package academy.devdojo.maratonajava.javacore.Gassociacoes.Dominio;

public class Escola {
    private String nome;
    private Professor[] professors;

    public Escola(String nome) {
        this.nome = nome;
    }
    public void imprime(){
        System.out.println("Escola: "+this.nome);
        if (professors == null){
            return;
        }
        for (Professor professor: professors){
            System.out.println("Professor: "+professor.getNome());

        }

    }

    public Escola(String nome, Professor[] professors) {
        this.nome = nome;
        this.professors = professors;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
