package iredejava.generics;

import java.util.ArrayList;
import java.util.List;

public class TesteComGenerics {
    static void main() {
        List<String> lista = new ArrayList<>();

        lista.add("Java");
        //lista.add(100); // Erro de compilacao

        String texto = lista.get(0);
        System.out.println(texto.toUpperCase());
    }

}
