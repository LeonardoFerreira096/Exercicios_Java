package javacore.Kenum.teste;

import javacore.Kenum.dominio.Cliente;
import javacore.Kenum.dominio.Cliente.TipoPagamento;
import javacore.Kenum.dominio.TipoCliente;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Leonardo", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBIDO);
        Cliente cliente2 = new Cliente("Leonardo", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
    }
}