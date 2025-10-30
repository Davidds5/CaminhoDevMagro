package academy.devdojo.maratonajava.javacore.Kenum.Dominio;

// enum pode ser criado tanto seperado(mais organizado)tanto junto da class
public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Fisica"),
    PESSOA_JURIDICA(2, "Pessoa Juridica");

    private String nomeRelatorio;
    private int valor;
     TipoCliente(int valor, String nomeRelatorio){
         this.valor = valor;
         this.nomeRelatorio = nomeRelatorio;

     }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }

    public int getValor() {
        return valor;
    }
}
