package academy.devdojo.maratonajava.javacore.JmodificadorFinal.Teste;

import academy.devdojo.maratonajava.javacore.JmodificadorFinal.Dominio.Carro;
import academy.devdojo.maratonajava.javacore.JmodificadorFinal.Dominio.Comprador;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(Carro.VELOCIDADE_LIMITE);
        // obs: so se altera se o metodo final for uma class, ai sim podemos alterar na class teste, usando o set
        // mas quando e criado pelo atributo da propria class nos nao conseguimos muda com o set
       // carro.setVELOCIDADE(200);
        System.out.println(carro.COMPRADOR);

        carro.COMPRADOR.setNome("Luis");
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("David");
        System.out.println(carro.COMPRADOR);

    }
}

