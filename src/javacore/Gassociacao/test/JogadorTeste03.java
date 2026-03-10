package javacore.Gassociacao.test;

import javacore.Gassociacao.dominio.Jogador;
import javacore.Gassociacao.dominio.Time;

public class JogadorTeste03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Giggs");
        Jogador jogador2 = new Jogador("Park");
        Time time = new Time("Manchester United");
        Jogador[] jogadores = {jogador,jogador2};

        jogador.setTime(time);
        jogador2.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("--- Jogador---");

        jogador.imprime();

        System.out.println("--- Time---");

        time.imprime();

    }
}
