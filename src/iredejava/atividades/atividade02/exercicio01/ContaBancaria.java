package iredejava.atividades.atividade02.exercicio01;

//1. Crie uma classe ContaBancaria com os atributos privados numero, titular e saldo.
//Implemente getters e setters, garantindo que o saldo não possa ser alterado
//diretamente (não crie setSaldo). Em vez disso, crie os métodos depositar() e sacar() para
//modicar o saldo.



public class ContaBancaria {
    private String numero;
    private String titular;
    private double saldo;

    public ContaBancaria(String numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de saque inválido.");
        } else if (valor > this.saldo) {
            System.out.println("Saldo insuficiente.");
        } else {
            this.saldo -= valor;
        }
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }
}