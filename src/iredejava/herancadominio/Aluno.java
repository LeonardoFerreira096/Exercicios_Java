package iredejava.herancadominio;

public class Aluno extends Pessoa {
    int matricula;

    public Aluno(String nome, int idade, int matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    public void monstrarMatricula() {
        System.out.println("Minha matricula é: " + matricula);
    }
}
