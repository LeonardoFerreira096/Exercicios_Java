import java.util.Scanner;

public class ParOuImpar {

    public static String parOuImpar(int n) {
        if (n % 2 == 0) {
            return "PAR";
        } else {
            return "IMPAR";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        String r;

        System.out.println("Digite um numero: ");
        n = scanner.nextInt();

        r = parOuImpar(n);

        System.out.println("O numero " + n + " é " + r);

        scanner.close();
    }
}