package javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTeclado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Gigite seu nome: ");
        String nome = entrada.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = entrada.nextInt();
        System.out.println("Digite M ou F para seu Sexo");
        char sexo = entrada.next().charAt(0);
        System.out.println("---------------------------------");
        System.out.println("Nome " +nome);
        System.out.println("Idade " +idade);
        System.out.println("Sexo " +sexo);

    }

}
