package br.com.exemplo.observer;

import java.util.ArrayList;
import java.util.List;

public class Campeonato {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer obs) {
        observers.add(obs);
    }

    public void removeObserver(Observer obs) {
        observers.remove(obs);
    }

    private void notifyObservers(PartidaResultado resultado) {
        for (Observer obs : observers) {
            obs.update(resultado);
        }
    }

    public void finalizarPartida(String timeA, String timeB, int golsA, int golsB) {
        PartidaResultado resultado = new PartidaResultado(timeA, timeB, golsA, golsB);
        System.out.println("Partida finalizada: " + resultado);
        notifyObservers(resultado);
    }
}
