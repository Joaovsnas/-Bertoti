package br.com.exemplo.observer;

public class PartidaResultado {
    private String timeA;
    private String timeB;
    private int golsA;
    private int golsB;

    public PartidaResultado(String timeA, String timeB, int golsA, int golsB) {
        this.timeA = timeA;
        this.timeB = timeB;
        this.golsA = golsA;
        this.golsB = golsB;
    }

    public String getTimeA() { return timeA; }
    public String getTimeB() { return timeB; }
    public int getGolsA() { return golsA; }
    public int getGolsB() { return golsB; }

    @Override
    public String toString() {
        return timeA + " " + golsA + " x " + golsB + " " + timeB;
    }
}
