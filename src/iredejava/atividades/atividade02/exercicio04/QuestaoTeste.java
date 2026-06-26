package iredejava.atividades.atividade02.exercicio04;

public class QuestaoTeste {
    public static void main(String[] args) {
        Engenheiro engenheiro = new Engenheiro("Leleo", 30, "Engenheiro de Software", 8000.0, "Software");
        System.out.println("Nome: " + engenheiro.getNome());
        System.out.println("Idade: " + engenheiro.getIdade());
        System.out.println("Cargo: " + engenheiro.getCargo());
        System.out.println("Salário: " + engenheiro.getSalario());
        System.out.println("Especialidade: " + engenheiro.getEspecialidade());
    }
}