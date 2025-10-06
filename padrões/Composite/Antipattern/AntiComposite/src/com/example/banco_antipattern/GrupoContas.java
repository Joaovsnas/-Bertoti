package com.example.banco_antipattern;

import java.util.ArrayList;
import java.util.List;

public class GrupoContas implements Conta {
    private String nomeGrupo;
    private List<Conta> contas = new ArrayList<>();

    public GrupoContas(String nomeGrupo) {
        this.nomeGrupo = nomeGrupo;
    }

    @Override
    public double getSaldo() {
        double total = 0;
        for (Conta c : contas) total += c.getSaldo();
        return total;
    }

    @Override
    public void exibirInfo(String prefixo) {
        System.out.println(prefixo + "Grupo: " + nomeGrupo);
        for (Conta c : contas) c.exibirInfo(prefixo + "  ");
    }

    @Override
    public void adicionar(Conta conta) {
        contas.add(conta);
    }

    @Override
    public void remover(Conta conta) {
        contas.remove(conta);
    }

    @Override
    public void solicitarEmprestimo(double valor) {
        double parte = valor / contas.size();
        for (Conta c : contas) {
            c.solicitarEmprestimo(parte);
        }
    }
}
