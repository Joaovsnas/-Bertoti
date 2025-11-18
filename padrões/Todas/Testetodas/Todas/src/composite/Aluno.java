package composite;

import observer.*;
import strategy.*;

import java.util.ArrayList;
import java.util.List;

public class Aluno implements ElementoEscola, Observado {
    private String nome;
    private List<Double> notas = new ArrayList<>();
    private EstrategiaMedia estrategiaMedia;
    private List<Observador> observadores = new ArrayList<>();

    public Aluno(String nome, EstrategiaMedia estrategiaMedia) {
        this.nome = nome;
        this.estrategiaMedia = estrategiaMedia;
    }

    public void adicionarNota(double nota) {
        notas.add(nota);
        notificar();
    }

    public double media() {
        return estrategiaMedia.calcular(notas);
    }

    @Override
    public void exibir() {
        System.out.println("Aluno: " + nome + " | Média: " + media());
    }

    @Override
    public void adicionarObservador(Observador obs) {
        observadores.add(obs);
    }

    @Override
    public void notificar() {
        for (Observador o : observadores) {
            o.atualizar(this);
        }
    }

    public String getNome() {
        return nome;
    }

    public List<Double> getNotas() {
        return notas;
    }
}
