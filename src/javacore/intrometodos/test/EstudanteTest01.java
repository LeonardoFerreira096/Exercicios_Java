package javacore.intrometodos.test;

import javacore.intrometodos.dominio.Estudante;
import javacore.intrometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();


        estudante01.nome = "Carlos André";
        estudante01.idade = 40;
        estudante01.sexo = 'M';


        estudante02.nome = "Ines dos Anjos";
        estudante02.idade = 52;
        estudante02.sexo = 'F';



        impressora.imprime(estudante01);


        impressora.imprime(estudante02);


    }
}
