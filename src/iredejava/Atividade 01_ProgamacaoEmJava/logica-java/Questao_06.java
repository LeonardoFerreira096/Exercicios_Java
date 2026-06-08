//6. Crie um array com os seguintes nomes: "Maria", "João", "Carlos", "Ana", "Beatriz". Em 
//seguida, peça um nome ao usuário e diga se ele está ou não no array.

import java.util.Scanner;

public class Questao_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nomes = { "Maria", "João", "Carlos", "Ana", "Beatriz" };

        System.out.println("Digite um nome: ");

        String nomeDigitado = scanner.nextLine();

        boolean encontrado = false;

        for (String nome : nomes) {

            if (nomeDigitado.equalsIgnoreCase(nome)) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("O nome está dentro do array");
        } else {
            System.out.println("O nome não está dentro do Array");
        }
        scanner.close();

    }
}
