package javacore.Eblocosdeinializacao.test;

import javacore.Eblocosdeinializacao.dominio.ClubeFutebol;

public class ClubeFutebolTest {
    public static void main(String[] args) {
        ClubeFutebol clubeFutebol = new ClubeFutebol();

        for (int numerocamisa : clubeFutebol.getNumerocamisa()) {
            System.out.print(numerocamisa + " ");
        }

    }
}
