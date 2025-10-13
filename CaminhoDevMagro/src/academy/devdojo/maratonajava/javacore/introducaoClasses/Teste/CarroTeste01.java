package academy.devdojo.maratonajava.javacore.introducaoClasses.Teste;

import academy.devdojo.maratonajava.javacore.introducaoClasses.Dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro1 = new Carro();
        carro.nome = "MUSTANG";
        carro.modelo = "Ferrari";
        carro.ano = 1999;

        carro1.nome = "Camaro";
        carro1.modelo = "Ferrari";
        carro1.ano = 2004;




        System.out.println("Nome: "+carro.nome+ ", Modelo: " + carro.modelo+ ", Ano: "+ carro.ano);
        System.out.println("Nome: "+carro1.nome+ ", Modelo: " + carro1.modelo+ ", Ano: "+ carro1.ano);

    }
}
