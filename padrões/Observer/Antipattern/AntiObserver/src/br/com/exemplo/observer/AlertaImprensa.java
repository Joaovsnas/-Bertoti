package br.com.exemplo.observer;
public class AlertaImprensa implements Observer {
    @Override
    public void update(Campeonato campeonato) {
        PartidaResultado r = campeonato.getUltimoResultado();
        System.out.println("[Imprensa] Enviando alerta: " + r);
        campeonato.observers.clear();
    }
}