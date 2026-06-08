//7. Crie um programa que leia um número inteiro não-negativo e calcule seu fatorial 
//utilizando o laço for.
//Exemplo: Entrada = 5 Saída = 120

import java.util.Scanner;

public class Questao_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numero;
        int fatorial = 1; 

        System.out.print("Digite um numero inteiro: ");
        numero = scanner.nextInt();

        
        if (numero < 0) {
            System.out.println("Fatorial não existe para números negativos.");
        } else {
            for (int i = 1; i <= numero; i++) {
                fatorial *= i; 
            }
            System.out.println("O Fatorial de " + numero + " é: " + fatorial);
        }

        scanner.close();
    }
}   
