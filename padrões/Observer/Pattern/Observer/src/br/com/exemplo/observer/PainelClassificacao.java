package br.com.exemplo.observer;

public class PainelClassificacao implements Observer {
    @Override
    public void update(PartidaResultado resultado) {
        System.out.println("[Painel] Atualizando classificação após: " + resultado);
    }
}
