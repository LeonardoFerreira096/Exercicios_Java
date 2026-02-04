package javacore.introclasses.teste;


import javacore.introclasses.dominio.Professor;

public class ProfessorTest01 {

        public  static void main(String[] args){
            Professor professor = new Professor();
            professor.nome = "Inessa Dos ANjos";
            professor.idade = 26;
            professor.sexo = 'F';

            System.out.println("Nome:" + professor.nome + " Idade:" + professor.idade + " Sexo:" + professor.sexo);

        }

    }
