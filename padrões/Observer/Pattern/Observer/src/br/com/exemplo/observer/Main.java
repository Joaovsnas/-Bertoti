package br.com.exemplo.observer;

public class Main {
    public static void main(String[] args) {
        Campeonato campeonato = new Campeonato();

        Observer painel = new PainelClassificacao();
        Observer imprensa = new AlertaImprensa();

        campeonato.addObserver(painel);
        campeonato.addObserver(imprensa);

        campeonato.finalizarPartida("Time A", "Time B", 2, 1);
        campeonato.finalizarPartida("Time C", "Time D", 1, 1);
    }
}
