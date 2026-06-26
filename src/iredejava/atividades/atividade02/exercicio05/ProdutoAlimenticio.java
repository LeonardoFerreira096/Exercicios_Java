package iredejava.atividades.atividade02.exercicio05;

public class ProdutoAlimenticio extends Produto {
    private String dataValidade;

    public ProdutoAlimenticio(String nome, double preco, String dataValidade) {
        super(nome, preco);
        this.dataValidade = dataValidade;
    }

    public String getDataValidade() {
        return dataValidade;
    }
    
    public boolean estaVencido() {
        if (dataValidade.compareTo("2026-06-26") < 0) {
            return true;
        }
        return false;   
    }
    
}
