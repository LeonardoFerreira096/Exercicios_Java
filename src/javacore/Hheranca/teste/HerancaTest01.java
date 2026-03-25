package javacore.Hheranca.teste;

import javacore.Hheranca.dominio.Endereco;
import javacore.Hheranca.dominio.Funcionario;
import javacore.Hheranca.dominio.Pessoa;

import java.math.BigDecimal;


public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua a");
        endereco.setCep("60810-810");
        Pessoa pessoa = new Pessoa("Leonardo");
        pessoa.setCpf("000.000.000-00");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        System.out.println("-------------");

        Funcionario funcionario = new Funcionario("Inessa");
        funcionario.setCpf("111.111.111-11");
        funcionario.setEndereco(endereco);
        BigDecimal salario = new BigDecimal("1500.50");
        funcionario.setSalario(salario);
        funcionario.imprime();

    }
}
