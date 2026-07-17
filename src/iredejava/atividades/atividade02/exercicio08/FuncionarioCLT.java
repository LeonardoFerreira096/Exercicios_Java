package iredejava.atividades.atividade02.exercicio08;

public class FuncionarioCLT extends Funcionario {

    @Override
    public double calcularSalario(double salario){
        double beneficios = 500.00;
        double descontosINSS = salario * 0.11;

        return salario + beneficios - descontosINSS;
    }
}
