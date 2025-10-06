package com.example.banco_antipattern;

public interface Conta {
    double getSaldo();
    void exibirInfo(String prefixo);
    void adicionar(Conta conta);
    void remover(Conta conta);
    void solicitarEmprestimo(double valor);
}
