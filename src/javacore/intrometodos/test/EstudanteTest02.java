package javacore.intrometodos.test;

import javacore.intrometodos.dominio.Estudante;
import javacore.intrometodos.dominio.ImpressoraEstudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Carlos André";
        estudante01.idade = 40;
        estudante01.sexo = 'M';


        estudante02.nome = "Ines dos Anjos";
        estudante02.idade = 52;
        estudante02.sexo = 'F';

        estudante01.imprime();

        estudante02.imprime();

    }

}
