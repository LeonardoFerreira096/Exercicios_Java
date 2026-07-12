package iredejava.poo.polimofismo.polimofismotest;

import iredejava.poo.polimofismo.polimofismodominio.Animal;
import iredejava.poo.polimofismo.polimofismodominio.Cachorro;
import iredejava.poo.polimofismo.polimofismodominio.Gato;

public class teste {
    public static void main(String[] args) {
        Animal a1 = new Cachorro();
        Animal a2 = new Gato();

        a1.fazerSom();
        a2.fazerSom();
    }


}
