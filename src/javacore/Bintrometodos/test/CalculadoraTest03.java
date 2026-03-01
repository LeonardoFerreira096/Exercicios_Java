package javacore.Bintrometodos.test;

import javacore.Bintrometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.dividirDoisNumeros(20, 2);
        System.out.println(result);
    }
}
