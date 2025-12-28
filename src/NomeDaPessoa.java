
import java.util.Scanner;


class Pessoa {

    String nome;
    int idade;

    void seApresentar() {
        System.out.println("Me chamo " + nome);
        System.out.println("e minha idade é " + idade + " anos!");
    }
}


public class NomeDaPessoa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pessoa pessoa1 = new Pessoa();

        System.out.print("Digite seu nome: ");
        pessoa1.nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        pessoa1.idade = scanner.nextInt();

        System.out.println("\n");
        pessoa1.seApresentar();

        scanner.close();
    }
}


