package com.example.banco_antipattern;

public class ContaIndividual implements Conta {
    private String titular;
    private double saldo;

    public ContaIndividual(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    @Override
    public double getSaldo() {
        return saldo;
    }

    @Override
    public void exibirInfo(String prefixo) {
        System.out.println(prefixo + "Conta: " + titular + " | Saldo: R$" + saldo);
    }

    @Override
    public void adicionar(Conta conta) {
        System.out.println("Erro: não é possível adicionar conta em " + titular);
    }

    @Override
    public void remover(Conta conta) {
        System.out.println("Erro: não é possível remover conta em " + titular);
    }

    @Override
    public void solicitarEmprestimo(double valor) {
        System.out.println("Empréstimo de R$" + valor + " concedido para " + titular);
        saldo += valor;
    }
}
