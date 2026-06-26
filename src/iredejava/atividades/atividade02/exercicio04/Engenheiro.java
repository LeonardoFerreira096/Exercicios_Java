package iredejava.atividades.atividade02.exercicio04;

public class Engenheiro extends Funcionario {
    private String especialidade;

    public Engenheiro(String nome, int idade, String cargo, double salario, String especialidade) {
        super(nome, idade, cargo, salario);
        this.especialidade = especialidade;
    }


    public String getEspecialidade() {
        return especialidade;
    }




}
