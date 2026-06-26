package iredejava.atividades.atividade02.exercicio05;

public class ProdutoTeste {
    public static void main(String[] args) {
        ProdutoAlimenticio produtoAlimenticio = new ProdutoAlimenticio("Arroz", 10.0, "2027-12-31");
        System.out.println("Nome: " + produtoAlimenticio.getNome());
        System.out.println("Preço: " + produtoAlimenticio.getPreco());
        System.out.println("Data de Validade: " + produtoAlimenticio.getDataValidade());

        if (produtoAlimenticio.estaVencido()) {
            System.out.println("O produto está vencido.");
        } else {
            System.out.println("O produto não está vencido.");
        }


    }
 
}