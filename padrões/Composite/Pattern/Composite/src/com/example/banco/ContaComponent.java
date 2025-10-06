package com.example.banco;

public interface ContaComponent {
    double getSaldo();
    void exibirInfo(String prefixo);
    default void adicionar(ContaComponent conta) {
        throw new UnsupportedOperationException();
    }
    default void remover(ContaComponent conta) {
        throw new UnsupportedOperationException();
    }
    default void solicitarEmprestimo(double valor) {
        throw new UnsupportedOperationException();
    }
}
