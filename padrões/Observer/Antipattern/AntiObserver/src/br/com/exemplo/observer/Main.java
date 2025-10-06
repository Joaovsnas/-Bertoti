package br.com.exemplo.observer;
public class Main {
    public static void main(String[] args) {
        Campeonato campeonato = new Campeonato();
        PainelClassificacao painel = new PainelClassificacao("Painel A");
        AlertaImprensa imprensa = new AlertaImprensa();
        campeonato.adicionarObserver(painel);
        campeonato.adicionarObserver(imprensa);
        campeonato.finalizarPartida("Time A", "Time B", 2, 1);
        campeonato.finalizarPartida("Time C", "Time D", 1, 1);
    }
}