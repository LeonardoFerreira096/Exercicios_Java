package iredejava.atividades.atividade02.exercicio08;

public class TesteFuncionario {

    public static void main(String[] args) {

        Funcionario[] funcionarios = {
                new FuncionarioCLT(3000),
                new FuncionarioPJ(3000)
        };

        for (Funcionario funcionario : funcionarios) {

            System.out.println(
                    funcionario.getClass().getSimpleName()
                    + " -> Salário: R$ "
                    + funcionario.calcularSalario()
            );
        }
    }
}