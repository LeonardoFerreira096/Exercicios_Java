//3. Implemente um programa que exiba um menu com 3 opções:
//     1 - Somar dois números
//     2 - Subtrair dois números
//     3 - Sair
//     O programa deve usar switch para executar a operação escolhida.

import java.util.Scanner;

public class Questao_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        int soma;
        int subtracao;
        int num1, num2;

        do {
            System.out.println(" MENU ");
            System.out.println("1 - Somar dois números");
            System.out.println("2 - Subtrair dois números");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
       
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o primeiro número: ");
                    num1 = scanner.nextInt();
                    System.out.print("Digite o segundo número: ");
                    num2 = scanner.nextInt();
                    soma = num1 + num2;
                    System.out.println("Resultado da soma: " + soma);
                    break;
                    
                case 2:
                    System.out.print("Digite o primeiro número: ");
                    num1 = scanner.nextInt();
                    System.out.print("Digite o segundo número: ");
                    num2 = scanner.nextInt();
                    subtracao = num1 - num2;
                    System.out.println("Resultado da subtração: " + subtracao);
                    break;
                    
                case 3:
                    System.out.println("SAIR DO MENU");
                    break;
                    
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 3); 

        scanner.close();
    }
}
