package com.example.banco;

public class ContaIndividual implements ContaComponent {
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
        System.out.println(prefixo + "Conta de " + titular + " | Saldo: R$" + saldo);
    }

    @Override
    public void solicitarEmprestimo(double valor) {
        System.out.println("Solicitação de empréstimo de R$" + valor + " para " + titular);
        saldo += valor;
        System.out.println("Novo saldo de " + titular + ": R$" + saldo);
    }
}
