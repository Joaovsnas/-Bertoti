package strategy;

import java.util.List;

public class MediaSimples implements EstrategiaMedia {
    @Override
    public double calcular(List<Double> notas) {
        double soma = 0;
        for (double n : notas) soma += n;
        return notas.isEmpty() ? 0 : soma / notas.size();
    }
}
