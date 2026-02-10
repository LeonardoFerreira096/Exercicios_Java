package javacore.intrometodos.test;

import javacore.intrometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Inessa Anjos");
        pessoa.setIdade(26);
        //pessoa.imprimi();
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
