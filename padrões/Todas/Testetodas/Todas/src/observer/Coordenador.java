package observer;

import composite.Aluno;

public class Coordenador implements Observador {
    private String nome;

    public Coordenador(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(Aluno aluno) {
        System.out.println("Coordenador " + nome +
                " recebeu atualização de notas do aluno " + aluno.getNome());
    }
}
