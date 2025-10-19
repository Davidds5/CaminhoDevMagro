package academy.devdojo.maratonajava.javacore.CSobreCargaDeMetodos.Dominio;

public class Anime {
    private String tipo;
    private int ep;

    public void imprime(){
        System.out.println(this.tipo);
        System.out.println(this.ep);
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getTipo(){
        return tipo;
    }

    public int getEp() {
        return ep;
    }

    public void setEp(int ep) {
        this.ep = ep;
    }
}
