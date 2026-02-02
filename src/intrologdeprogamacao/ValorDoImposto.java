package intrologdeprogamacao;

// Calculo de salario anual sobre imposto descrito.

public class ValorDoImposto {
    public static void main(String[] args) {
        double SalarioAnual = 70000;
        double Faixa01 = 9.70 / 100;
        double Faixa02 = 37.35 / 100;
        double Faixa03 = 49.50 / 100;
        double ValorImposto ;


        if ( SalarioAnual <= 34712) {
            ValorImposto = SalarioAnual* Faixa01;
        } else if (SalarioAnual >= 34713 && SalarioAnual <= 68507) {
            ValorImposto = SalarioAnual * Faixa02;
        } else {
            ValorImposto = SalarioAnual * Faixa03;
        }
        System.out.println(String.format("%.2f", ValorImposto));
    }
}
