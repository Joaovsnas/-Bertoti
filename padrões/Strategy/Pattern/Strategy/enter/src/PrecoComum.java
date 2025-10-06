public class PrecoComum implements CalculadoraPreco {
    @Override
    public double calcular(int diasAlugado) {
        double preco = 2;
        if (diasAlugado > 2) {
            preco += (diasAlugado - 2) * 1.5;
        }
        return preco;
    }
}
