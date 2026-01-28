package execicios.java.introducao;

public class ValorDoImposto {
    public static void main(String[] args) {
        double salarioAnual = 50000;
        double Faixa01 = 9.70 / 100;
        double Faixa02 = 37.35 / 100;
        double Faixa03 = 49.50 / 100;


        if ( salarioAnual <= 34712) {
            salarioAnual = salarioAnual * Faixa01;
        } else if (salarioAnual <= 68507) {
            salarioAnual = salarioAnual * Faixa02;
        } else {
            salarioAnual = salarioAnual * Faixa03;
        }
        System.out.println(String.format("%.2f", salarioAnual));
    }
}
