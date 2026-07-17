package iredejava.tratamento_excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tratamento {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        exemploArithmeticException(ler);
        ler.close();
        System.out.println("Fim do programa");
    }

    private static void exemploArithmeticException(Scanner ler) {
        try {
            System.out.println("Informe o primeiro numero: ");
            int n1 = ler.nextInt();
            System.out.println("Informe o segundo numero: ");
            int n2 = ler.nextInt();
            int resultado = n1 / n2;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero.");
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Erro: Dados inválidos.");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro Inesperado. ");
        }
    }
}
