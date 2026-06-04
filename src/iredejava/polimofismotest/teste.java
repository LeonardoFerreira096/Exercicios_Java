package iredejava.polimofismotest;

import iredejava.polimofismodominio.Animal;
import iredejava.polimofismodominio.Cachorro;
import iredejava.polimofismodominio.Gato;

public class teste {
    public static void main(String[] args) {
        Animal a1 = new Cachorro();
        Animal a2 = new Gato();

        a1.fazerSom();
        a2.fazerSom();
    }


}
