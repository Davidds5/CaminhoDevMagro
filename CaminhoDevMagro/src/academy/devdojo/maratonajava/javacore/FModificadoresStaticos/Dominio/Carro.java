package academy.devdojo.maratonajava.javacore.FModificadoresStaticos.Dominio;

public class Carro {
    private String nome;
    private double velociadadeMaxima;
    public static double velocidadeLimite = 250;

    public Carro(String nome, double velociadadeMaxima  ) {
        this.nome = nome;
        this.velociadadeMaxima = velociadadeMaxima;

    }

    // podemos usar o this aqui e nao no metodo static, pq aqui nos temos certeza que sera estanciado
    public void imprime(){
        System.out.println("____________________");
        System.out.println("Nome: "+this.nome);
        System.out.println("Velocidade Maxima: "+this.velociadadeMaxima);
        System.out.println("Velocidade Limite: "+this.velocidadeLimite);
    }

    // so funciona se colocar  molde diretamente
    public static void setVelocidadeLimite(double velocidadeLimite){
        Carro.velocidadeLimite = velocidadeLimite;
    }
    public static double getVelocidadeLimite(){
        return velocidadeLimite;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelociadadeMaxima() {
        return velociadadeMaxima;
    }

    public void setVelociadadeMaxima(double velociadadeMaxima) {
        this.velociadadeMaxima = velociadadeMaxima;
    }


}
