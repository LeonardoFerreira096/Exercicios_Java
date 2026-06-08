//4. Crie um programa que leia um número inteiro do usuário e imprima a tabuada 
//desse número (de 1 a 10), usando um laço for

import java.util.Scanner;

public class Questao_04 {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.print("Digite um numero de 1 a 10: ");
        numero = scanner.nextInt();

        System.out.println(" TABUADA DE " + numero);

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        scanner.close();

    }
}
