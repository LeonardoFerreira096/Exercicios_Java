package iredejava.atividades.atividade02.exercicio10;

public class PagamentoCartao extends Pagamento {
    @Override
    void processarPagamento() {
        System.out.println("Processando pagamento com cartão de crédito:R$ 100,00");
    }
    
}
