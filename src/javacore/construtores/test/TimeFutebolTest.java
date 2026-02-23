package javacore.construtores.test;

import javacore.construtores.dominio.TimeFutebol;

public class TimeFutebolTest {
    public static void main(String[] args) {
        TimeFutebol timeFutebol = new TimeFutebol("Manchester United","Manchester - ING", 1878, "Diabos Vermelhos", "Old Trafford");
        timeFutebol.imprime();
    }
}
