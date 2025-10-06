package br.com.exemplo.observer;
import java.util.ArrayList;
import java.util.List;
public class Campeonato {
    public static List<Observer> observers = new ArrayList<>();
    private PartidaResultado ultimoResultado;

    public void adicionarObserver(Observer o) {
        observers.add(o);
    }

    public void removerObserver(Observer o) {
        observers.remove(o);
    }

    public PartidaResultado getUltimoResultado() {
        return ultimoResultado;
    }

    public void finalizarPartida(String timeA, String timeB, int golsA, int golsB) {
        this.ultimoResultado = new PartidaResultado(timeA, timeB, golsA, golsB);
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer o : new ArrayList<>(observers)) {
            try {
                o.update(this);
            } catch (RuntimeException e) {
                break;
            }
        }
    }
}