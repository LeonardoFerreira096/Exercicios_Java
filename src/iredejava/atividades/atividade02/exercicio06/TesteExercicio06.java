package iredejava.atividades.atividade02.exercicio06;

public class TesteExercicio06 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Andrezza", 5000.0, "Email Marketing");
        System.out.println("Nome: " + gerente.getNome());
        System.out.println("Salário: " + gerente.getSalario());
        System.out.println("Departamento: " + gerente.getDepartamento());
    }
}
