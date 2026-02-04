package javacore.introclasses.teste;

import javacore.introclasses.dominio.Carro;

public class CarroTestEXE {
    public static void main(String[] args) {
        Carro carro1 = new Carro ();
        Carro carro2 = new Carro();

        carro1.nome = " volkswagen";
        carro1.modelo = " Gol Paraty ";
        carro1.ano = 2011;

        carro1 = carro2;

        carro2.nome = "Fiat";
        carro2.modelo = " Fiat Argo";
        carro2.ano = 2020;


        System.out.println(" nome:" + carro1.nome + " modelo:" + carro1.modelo + " ano:" + carro1.ano);
        System.out.println(" nome:" + carro2.nome + " modelo:" + carro2.modelo + " ano:" + carro2.ano);
    }


}
