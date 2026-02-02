package intrologdeprogamacao;

public class PagamentoEmParcelas {
    public static void main(String[] args){
        double ValorCarro = 20000;

        for (int parcela = 1; parcela <= ValorCarro ; parcela++) {
            double ValorParcela = ValorCarro / parcela;
            if (ValorParcela < 1000) {
                break;
            }
            System.out.println(" Parcela " + parcela + " R$ " + ValorParcela);
        }
    }

}
