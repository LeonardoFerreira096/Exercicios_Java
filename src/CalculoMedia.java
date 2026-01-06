import java.util.Scanner;

public class CalculoMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota1, nota2, media;

        System.out.println("Qual primeira nota?");
        nota1 = scanner.nextDouble();

        System.out.println("Qual segunda nota?");
        nota2 = scanner.nextDouble();

        media = (nota1 + nota2) / 2;

        System.out.printf("Sua media e: %.2f%n", media);

        if (media >= 7) {
            System.out.println("Aprovado por media!");
        } else if (media >= 5 && media < 7) {
            System.out.println("Recuperacao!");
        } else {
            System.out.println("Reprovado!");
        }

        scanner.close();
    }
}