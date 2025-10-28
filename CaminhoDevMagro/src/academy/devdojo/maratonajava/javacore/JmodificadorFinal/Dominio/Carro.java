package academy.devdojo.maratonajava.javacore.JmodificadorFinal.Dominio;

public class Carro {
    private String nome;
    public  static final double VELOCIDADE_LIMITE = 0;
    // esse valor nao podera ser mudado de nenhuma forma depois de colocar o metodo "final".
    public static final Comprador COMPRADOR = new Comprador();


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Comprador getCOMPRADOR() {
        return COMPRADOR;
    }
    public double setVELOCIDADE(){
        return VELOCIDADE_LIMITE;
    }

}

