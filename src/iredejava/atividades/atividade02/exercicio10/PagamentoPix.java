package iredejava.atividades.atividade02.exercicio10;

public class PagamentoPix extends Pagamento {
    @Override
    void processarPagamento() {
        System.out.println("Processando pagamento com PIX:R$ 100,00");
    }
}
