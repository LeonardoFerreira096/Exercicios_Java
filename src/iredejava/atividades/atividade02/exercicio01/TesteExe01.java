package iredejava.atividades.atividade02.exercicio01;

public class TesteExe01 {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("01", "Leonardo", 1000.0);

        conta.depositar(50);
        System.out.println("Saldo após depósito: " + conta.getSaldo());

        conta.sacar(30);
        System.out.println("Saldo após saque: " + conta.getSaldo());

        conta.sacar(500);
    }
}