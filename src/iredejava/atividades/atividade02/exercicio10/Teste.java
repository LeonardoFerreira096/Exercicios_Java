package iredejava.atividades.atividade02.exercicio10;

public class Teste {
    public static void main(String[] args) {
        Pagamento pagamentoCartao = new PagamentoCartao();
        Pagamento pagamentoPix = new PagamentoPix();
        
        pagamentoCartao.processarPagamento();
        pagamentoPix.processarPagamento();
    }
}
