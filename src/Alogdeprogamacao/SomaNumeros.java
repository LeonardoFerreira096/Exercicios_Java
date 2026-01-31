package Alogdeprogamacao;

import java.util.Scanner;

public class SomaNumeros {

    public static int soma(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int v1, v2, s;

        System.out.println("Digite o primeiro numero: ");
        v1 = scanner.nextInt();

        System.out.println("Digite o segundo numero: ");
        v2 = scanner.nextInt();

        s = soma(v1, v2);

        System.out.println("A soma entre " + v1 + " e " + v2 + " e igual a " + s);

        scanner.close();
    }
}