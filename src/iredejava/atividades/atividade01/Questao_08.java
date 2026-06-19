package iredejava.atividades.atividade01;

import java.util.Scanner;

public class Questao_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println(" MENU ");
            System.out.println("1 - Olá ");
            System.out.println("2 - Tchau");
            System.out.println("3 - Encerra");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Olá");
                    opcao = scanner.nextInt();
                    break;
                case 2:
                    System.out.print("Tchau ");
                    opcao = scanner.nextInt();
                case 3:
                    System.out.println("Encerrado ");
                    opcao = scanner.nextInt();
                    break;
                default:
                    break;
            }

        } while (opcao != 3);
        scanner.close();
    }

}
