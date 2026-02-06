package javacore.intrometodos.test;

import javacore.intrometodos.dominio.Funcionario;

public class FuncionarioTestExercicio {
    public static void main(String[] args) {
        Funcionario funcionario01 = new Funcionario("Victor Chongs", 28, 2000, 2100, 3000);

        Funcionario funcionario02 = new Funcionario("Dona Ju", 41, 1000, 2200, 3000);

        Funcionario funcionario03 = new Funcionario("Andressa Frits", 27, 3000, 3800, 5000);

        funcionario01.imprime();
        funcionario01.calcularMedia();



        System.out.println("=========================");

        funcionario02.imprime();
        funcionario02.calcularMedia();

        System.out.println("=========================");

        funcionario03.imprime();
        funcionario03.calcularMedia();



    }
}
