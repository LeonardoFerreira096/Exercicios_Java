package iredejava.atividades.atividade02.exercicio08;

public class FuncionarioPJ extends Funcionario {

    public FuncionarioPJ(double salario) {
        super(salario);
    }

    @Override
    public double calcularSalario() {

        double bonusPJ = 1000;

        return salario + bonusPJ;
    }
}