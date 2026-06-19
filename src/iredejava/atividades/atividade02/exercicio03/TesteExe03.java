package iredejava.atividades.atividade02.exercicio03;

public class TesteExe03 {
    public static void main(String[] args) {
        Produto produto = new Produto("Chocolate ao Leite - Lacta");

        System.out.println("Produto: " + produto.getNome());

        produto.setPreco(10);
        System.out.println("Valor do produto: " + produto.getPreco());


        produto.setQuantidadeEstoque(150);
        System.out.println("Quantidade no Estoque: " + produto.getQuantidadeEstoque());


    }
}
