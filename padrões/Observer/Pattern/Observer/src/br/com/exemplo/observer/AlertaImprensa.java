package br.com.exemplo.observer;

public class AlertaImprensa implements Observer {
    @Override
    public void update(PartidaResultado resultado) {
        System.out.println("[Imprensa] Enviando alerta: " + resultado);
    }
}
