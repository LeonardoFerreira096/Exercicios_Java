package javacore.Gassociacao.test;

import javacore.Gassociacao.dominio.Jogador;

public class JogadorTest {
    public static void main(String[] args) {
        Jogador jogador01 = new Jogador("Ryan Giggs");
        Jogador jogador02 = new Jogador("Paul Scholes");
        Jogador jogador03 = new Jogador("Carrick");

        Jogador[] jogadores = {jogador01, jogador02, jogador03};

        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }
    }
}
