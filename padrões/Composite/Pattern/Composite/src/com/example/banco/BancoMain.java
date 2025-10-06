package com.example.banco;

public class BancoMain {
    public static void main(String[] args) {
        ContaIndividual conta1 = new ContaIndividual("Alice", 5000);
        ContaIndividual conta2 = new ContaIndividual("Bruno", 2500);
        ContaIndividual conta3 = new ContaIndividual("Carlos", 800);

        GrupoContas grupoPessoal = new GrupoContas("Clientes Pessoais");
        grupoPessoal.adicionar(conta1);
        grupoPessoal.adicionar(conta2);
        grupoPessoal.adicionar(conta3);

        ContaIndividual empresa1 = new ContaIndividual("Empresa X", 20000);
        ContaIndividual empresa2 = new ContaIndividual("Empresa Y", 15000);
        GrupoContas grupoEmpresarial = new GrupoContas("Empresas");
        grupoEmpresarial.adicionar(empresa1);
        grupoEmpresarial.adicionar(empresa2);

        GrupoContas banco = new GrupoContas("Banco Central");
        banco.adicionar(grupoPessoal);
        banco.adicionar(grupoEmpresarial);

        banco.exibirInfo("");
        System.out.println("\nSaldo total no banco: R$" + banco.getSaldo());

        System.out.println("\n=== Empréstimo geral ===");
        banco.solicitarEmprestimo(10000);

        System.out.println("\nSaldo total após empréstimo: R$" + banco.getSaldo());
    }
}
