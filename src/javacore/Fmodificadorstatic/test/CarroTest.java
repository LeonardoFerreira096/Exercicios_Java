package javacore.Fmodificadorstatic.test;

import javacore.Fmodificadorstatic.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro.setVelocidadeLimite(180);

        Carro c1 = new Carro( " BMW", 280);
        Carro c2 = new Carro( " Audi",290);
        Carro c3 = new Carro( " Mercedes",275);

        c1.imprimi();
        c2.imprimi();
        c3.imprimi();
    }
}
