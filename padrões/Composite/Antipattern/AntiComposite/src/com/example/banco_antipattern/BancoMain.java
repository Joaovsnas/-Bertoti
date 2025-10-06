package com.example.banco_antipattern;

public class BancoMain {
    public static void main(String[] args) {
        ContaIndividual c1 = new ContaIndividual("Alice", 1000);
        ContaIndividual c2 = new ContaIndividual("Bruno", 2000);

        GrupoContas grupo = new GrupoContas("Grupo Principal");
        grupo.adicionar(c1);
        grupo.adicionar(c2);

        c1.adicionar(c2);

        grupo.exibirInfo("");
        System.out.println("Saldo total: R$" + grupo.getSaldo());

        grupo.solicitarEmprestimo(5000);
    }
}
