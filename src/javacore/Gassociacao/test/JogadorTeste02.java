package javacore.Gassociacao.test;

import javacore.Gassociacao.dominio.Jogador;
import javacore.Gassociacao.dominio.Time;


public class JogadorTeste02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Bruno Fernandes");
        Time time = new Time("Manchester United");

        jogador1.setTime(time);
        jogador1.imprime();
    }
}
