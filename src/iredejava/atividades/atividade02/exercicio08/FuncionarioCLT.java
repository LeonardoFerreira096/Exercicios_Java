package iredejava.atividades.atividade02.exercicio08;

public class FuncionarioCLT extends Funcionario {

    public FuncionarioCLT(double salario) {
        super(salario);
    }

    @Override
    public double calcularSalario() {

        double beneficios = 500;
        double descontoINSS = salario * 0.11;

        return salario + beneficios - descontoINSS;
    }
}