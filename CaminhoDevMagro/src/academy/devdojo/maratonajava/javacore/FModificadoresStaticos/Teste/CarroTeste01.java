package academy.devdojo.maratonajava.javacore.FModificadoresStaticos.Teste;

import academy.devdojo.maratonajava.javacore.FModificadoresStaticos.Dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro("BMW", 280 );
        Carro carro2 = new Carro("Mustang", 300);
        Carro carro3 = new Carro("Fuscao", 500 );

        // isso ira altera todos os objetos da class
        Carro.velocidadeLimite = 150;
        carro1.imprime();
        carro2.imprime();
        carro3.imprime();
    }
}
