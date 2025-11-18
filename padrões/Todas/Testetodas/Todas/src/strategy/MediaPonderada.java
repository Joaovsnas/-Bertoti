package strategy;

import java.util.List;

public class MediaPonderada implements EstrategiaMedia {
    @Override
    public double calcular(List<Double> notas) {
        double soma = 0;
        double peso = 1;
        double somaPesos = 0;
        for (double n : notas) {
            soma += n * peso;
            somaPesos += peso;
            peso++;
        }
        return notas.isEmpty() ? 0 : soma / somaPesos;
    }
}
