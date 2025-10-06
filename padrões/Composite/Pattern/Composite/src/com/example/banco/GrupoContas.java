package com.example.banco;

import java.util.ArrayList;
import java.util.List;

public class GrupoContas implements ContaComponent {
    private String nomeGrupo;
    private List<ContaComponent> contas = new ArrayList<>();

    public GrupoContas(String nomeGrupo) {
        this.nomeGrupo = nomeGrupo;
    }

    @Override
    public double getSaldo() {
        double total = 0;
        for (ContaComponent conta : contas) {
            total += conta.getSaldo();
        }
        return total;
    }

    @Override
    public void exibirInfo(String prefixo) {
        System.out.println(prefixo + "Grupo: " + nomeGrupo);
        for (ContaComponent conta : contas) {
            conta.exibirInfo(prefixo + "  ");
        }
    }

    @Override
    public void adicionar(ContaComponent conta) {
        contas.add(conta);
    }

    @Override
    public void remover(ContaComponent conta) {
        contas.remove(conta);
    }

    @Override
    public void solicitarEmprestimo(double valor) {
        System.out.println("Distribuindo empréstimo de R$" + valor + " entre as contas do grupo " + nomeGrupo);
        double parte = valor / contas.size();
        for (ContaComponent conta : contas) {
            conta.solicitarEmprestimo(parte);
        }
    }
}
