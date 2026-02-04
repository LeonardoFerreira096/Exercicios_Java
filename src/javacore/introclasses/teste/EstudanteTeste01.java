package javacore.introclasses.teste;

import javacore.introclasses.dominio.Estudante;

public class EstudanteTeste01 {
    public  static void main(String[] args){
        Estudante estudante = new Estudante();
        estudante.nome = "Leonardo";
        estudante.idade = 29;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }

}
