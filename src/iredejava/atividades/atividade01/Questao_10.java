package iredejava.atividades.atividade01;

import java.util.Scanner;

public class Questao_10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um texto: ");
        String texto = scanner.nextLine();

        int quantidadeLetras = texto.length();

        System.out.println("O texto digitado tem " + quantidadeLetras + " caracteres.");

        scanner.close();
    }
}
