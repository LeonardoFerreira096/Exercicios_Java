package iredejava.atividades.atividade01;

import java.util.Scanner;

public class Questao_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome completo: ");
        String nomeString = scanner.nextLine();

        // nesse eu pesquisei esse método Split(nao conhecia o objetivo)
        String[] nomesFatiados = nomeString.split(" ");

        String primeiroNome = nomesFatiados[0];

        String ultimoNome = nomesFatiados[nomesFatiados.length - 1];

        System.out.println("Primeiro nome: " + primeiroNome);
        System.out.println("Último nome: " + ultimoNome);

        scanner.close();
    }
}
