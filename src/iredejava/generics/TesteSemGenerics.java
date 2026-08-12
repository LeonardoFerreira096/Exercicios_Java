package iredejava.generics;

import java.util.ArrayList;
import java.util.List;

public class TesteSemGenerics {
    public static void main(String[] args) {
        List lista = new ArrayList();

        lista.add("Java");
        lista.add(123);


        String texto = (String) lista.get(0);
        System.out.println(texto.toUpperCase());


        String erro = (String) lista.get(1);
        System.out.println(erro.toUpperCase());
    }

}

