package iredejava.herancatest;

import iredejava.herancadominio.Aluno;
import iredejava.herancadominio.Pessoa;
import iredejava.herancadominio.Professor;

public class herancatest {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Leonardo", 29, 12234);
        Professor professor = new Professor("Rosy Costa",45,4000);

        aluno.apresentar();
        professor.apresentar();

        aluno.monstrarMatricula();
        professor.montrarSalario();

    }
}
