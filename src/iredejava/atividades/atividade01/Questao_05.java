package iredejava.atividades.atividade01;//5. Faça um programa que leia uma string e substitua todas as ocorrências da letra "e"
//por "*".

import java.util.Scanner;

public class Questao_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um texto: ");
        String textoOriginal = scanner.nextLine();

        String textoModificado = textoOriginal.replace('e', '*');

        System.out.println("Resultado do Texto modificado: " + textoModificado);

        scanner.close();
    }
}
