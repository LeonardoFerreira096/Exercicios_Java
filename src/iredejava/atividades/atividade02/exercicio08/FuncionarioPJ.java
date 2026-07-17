package iredejava.atividades.atividade02.exercicio08;

public class FuncionarioPJ extends Funcionario {

    @Override
    public double calcularSalario(double salario) {
        double bonusPJ = 1000.00;

        return salario + bonusPJ;
    }
}
