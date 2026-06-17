package javacore.Fmodificadorstatic.test;

import javacore.Fmodificadorstatic.dominio.ClubeFutebol;

public class ClubeFutebolTest {
    public static void main(String[] args) {
        ClubeFutebol clubeFutebol1 = new  ClubeFutebol("Flamengo");
        ClubeFutebol clubeFutebol2 = new  ClubeFutebol("Fortaleza");
        ClubeFutebol clubeFutebol3 = new  ClubeFutebol("Manchester United");

        System.out.println(clubeFutebol1.getNome());
        System.out.println(clubeFutebol2.getNome());
        System.out.println(clubeFutebol3.getNome());
    }

}
