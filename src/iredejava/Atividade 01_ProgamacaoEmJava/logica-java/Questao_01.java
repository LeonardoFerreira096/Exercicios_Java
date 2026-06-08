
//1. Escreva um programa Java que use os operadores lógicos para verificar se um número está entre 10 e 20 (inclusive). Use int numero = 15;.


public class Questao_01 {

    public static void main(String[] args) {
        int numero = 15;
        if (numero >= 10 && numero <= 20) {
            System.out.println("O " + numero + " Está entre 10 e 20");
        } else {
            System.out.println("O " + numero + " Não está entre 10 e 15");
        }

    }
}

