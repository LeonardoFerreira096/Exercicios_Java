package iredejava.atividades.atividade02.exercicio08;

public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[2];
        funcionarios[0] = new FuncionarioCLT();
        funcionarios[1] = new FuncionarioPJ();

        double salarioBase = 3000.00;

        for (Funcionario funcionario : funcionarios){

            double salarioCalculado = funcionario.calcularSalario(salarioBase);


            System.out.println("Salário Final: R$ " + salarioCalculado);
        }
    }
}
