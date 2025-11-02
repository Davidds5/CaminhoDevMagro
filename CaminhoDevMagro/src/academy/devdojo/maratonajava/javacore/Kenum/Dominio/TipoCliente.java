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
     // values cria uma lista com todos os valores da class enum tipo cliente
    // usando o for conseguimos pecorre por essa lista
    // equals e pra confirma se o nome buscado pelo get e igual ao nome do relatorio digitado,
    // se for igual ele retorna
     public static TipoCliente tipoClientePorNomeRelatorio(String nomeRelatorio) {
         for (TipoCliente tipoCliente : values()) {
             if (tipoCliente.getNomeRelatorio().equals(nomeRelatorio)) {
                 return tipoCliente;
             }
         }
         return null;
     }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }

    public int getValor() {
        return valor;
    }
}
