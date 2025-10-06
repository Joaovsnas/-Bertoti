package br.com.exemplo.observer;
public class PainelClassificacao implements Observer {
    private String nome;

    public PainelClassificacao(String nome) {
        this.nome = nome;
    }

    @Override
    public void update(Campeonato campeonato) {
        PartidaResultado r = campeonato.getUltimoResultado();
        System.out.println("[" + nome + "] Atualizando classificação após: " + r);
        campeonato.observers.add(new AlertaImprensa()); 
    }
}