package academy.devdojo.maratonajava.javacore.Gassociacoes.Dominio;

public class Time {
    private String nome;
    private Jogador[] jogadors;

    public Time(String nome){
        this.nome = nome;
    }

    public Time(String nome, Jogador[] jogador) {
        this.nome = nome;
        this.jogadors = jogador;
    }

    public void imprime(){
        System.out.println(this.nome);
        if (jogadors == null) return;
        for (Jogador jogador : jogadors){
            System.out.println(jogador.getNome());
        }
    }




    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Jogador[] getJogadors() {
        return jogadors;
    }
    public void setJogadors(Jogador[] jogadors) {
        this.jogadors = jogadors;
    }
}
