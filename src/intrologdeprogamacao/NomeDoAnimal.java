package intrologdeprogamacao;

import java.util.Scanner;

class Animal {

          String nome;
          String raca;

          void Caracteristica (){
              System.out.println(" AU AU " + raca);
          }

      }
      public class NomeDoAnimal {
          public static void main(String[] args) {
              Scanner scanner = new Scanner(System.in);

              Animal animal1 = new Animal();


              System.out.print("Digite o nome: ");
              animal1.nome = scanner.nextLine();


              System.out.print("Raça: " );
              animal1.raca = scanner.nextLine();


              System.out.println("\n");
              animal1.Caracteristica();

              scanner.close();
    }
}
