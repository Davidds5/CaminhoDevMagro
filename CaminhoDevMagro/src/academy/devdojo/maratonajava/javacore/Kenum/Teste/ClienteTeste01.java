package academy.devdojo.maratonajava.javacore.Kenum.Teste;

import academy.devdojo.maratonajava.javacore.Kenum.Dominio.Cliente;
import academy.devdojo.maratonajava.javacore.Kenum.Dominio.TipoCliente;

public class ClienteTeste01 {
    public static void main(String[] args) {

        Cliente cliente01 = new Cliente("Luis", TipoCliente.PESSOA_FISICA, Cliente.TipoPagamento.CREDITO);
        Cliente cliente02 = new Cliente("David", TipoCliente.PESSOA_FISICA, Cliente.TipoPagamento.CREDITO);
        Cliente cliente03 = new Cliente("Luanna", TipoCliente.PESSOA_JURIDICA, Cliente.TipoPagamento.DEBITO);
        Cliente cliente04 = new Cliente("Gaby", TipoCliente.PESSOA_JURIDICA, Cliente.TipoPagamento.DEBITO);

        System.out.println(cliente01);
        System.out.println(cliente02);
        System.out.println(cliente03);
        System.out.println(cliente04);

    }
}
