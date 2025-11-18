import strategy.*;
import composite.Aluno;
import composite.GrupoEscola;
import observer.*;

public class Main {
    public static void main(String[] args) {

        GrupoEscola escola = new GrupoEscola("Escola Estadual Central");
        GrupoEscola departamento = new GrupoEscola("Departamento de Matemática");
        GrupoEscola turma = new GrupoEscola("Turma 2B");

        Aluno aluno1 = new Aluno("Vitor", new MediaSimples());
        Aluno aluno2 = new Aluno("Neymar", new MediaPonderada());

        Professor prof = new Professor("Giuliano");
        Coordenador coord = new Coordenador("Bertoti");

        aluno1.adicionarObservador(prof);
        aluno1.adicionarObservador(coord);

        aluno2.adicionarObservador(coord);

        turma.adicionar(aluno1);
        turma.adicionar(aluno2);

        departamento.adicionar(turma);
        escola.adicionar(departamento);

        aluno1.adicionarNota(8);
        aluno1.adicionarNota(7);

        aluno2.adicionarNota(6);
        aluno2.adicionarNota(9);

        System.out.println();
        escola.exibir();
    }
}
