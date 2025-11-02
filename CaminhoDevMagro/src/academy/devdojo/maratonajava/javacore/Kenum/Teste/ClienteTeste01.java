package academy.devdojo.maratonajava.javacore.Kenum.Teste;

import academy.devdojo.maratonajava.javacore.Kenum.Dominio.Cliente;
import academy.devdojo.maratonajava.javacore.Kenum.Dominio.TipoCliente;
import academy.devdojo.maratonajava.javacore.Kenum.Dominio.TipoPagamento;

public class ClienteTeste01 {
    public static void main(String[] args) {

        Cliente cliente01 = new Cliente("Luis", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente02 = new Cliente("David", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente03 = new Cliente("Luanna", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);
        Cliente cliente04 = new Cliente("Gaby", TipoCliente.PESSOA_JURIDICA,TipoPagamento.DEBITO);

        System.out.println(cliente01);
        System.out.println(cliente02);
        System.out.println(cliente03);
        System.out.println(cliente04);
        // agr podemos usar o metodo calcular diretamente do enum de pagamento
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));

        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente.getNomeRelatorio());

        // quando se e assim nao e preciso busca por nome relatorio
        // estanciando usando o metodo static usado na class enum, tipo cliente
        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Fisica11");
        System.out.println(tipoCliente2);
    }
}
