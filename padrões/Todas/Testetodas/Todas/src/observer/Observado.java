package observer;

public interface Observado {
    void adicionarObservador(Observador obs);
    void notificar();
}
