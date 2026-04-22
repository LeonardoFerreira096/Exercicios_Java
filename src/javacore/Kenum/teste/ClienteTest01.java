package javacore.Kenum.teste;

import javacore.Kenum.dominio.Cliente;
import javacore.Kenum.dominio.TipoCliente;
import javacore.Kenum.dominio.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Leonardo", TipoCliente.PESSOA_FISICA,TipoPagamento.DEBIDO );
        Cliente cliente2 = new Cliente("Victor", TipoCliente.PESSOA_JURIDICA,TipoPagamento.CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.DEBIDO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));

        //buscar por atributo: criou um metodo
        // para retorna baseado no qual desejar
        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente.getNomeRelatorio());
        TipoCliente tipoCliente2 = TipoCliente.TipoClientePorNomeRelatorio("Pessoa Física");
        System.out.println(tipoCliente2);

    }
}