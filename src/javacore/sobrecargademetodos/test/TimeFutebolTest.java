package javacore.sobrecargademetodos.test;


import javacore.sobrecargademetodos.dominio.TimeFutebol;

public class TimeFutebolTest {
    public static void main(String[] args) {
       TimeFutebol timeFutebol = new TimeFutebol();
        timeFutebol.init("Manchester United","Manchester - ING", 1878 );
        timeFutebol.setApelidotime("Diabos Vermelhos");
        timeFutebol.imprime();
    }
}
