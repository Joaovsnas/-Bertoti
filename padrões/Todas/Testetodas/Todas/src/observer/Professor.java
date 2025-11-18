package observer;

import composite.Aluno;

public class Professor implements Observador {
    private String nome;

    public Professor(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(Aluno aluno) {
        System.out.println("Professor " + nome +
                " notificado: nova nota adicionada ao aluno " + aluno.getNome());
    }
}
