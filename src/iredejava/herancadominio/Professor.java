package iredejava.herancadominio;

public class Professor extends Pessoa {
    double salario;

    public Professor(String nome, int idade, double salario) {
        super(nome, idade);
        this.salario = salario;
    }

    public void montrarSalario() {
        System.out.println("Meu salario é: R$ " + salario);
    }
}
