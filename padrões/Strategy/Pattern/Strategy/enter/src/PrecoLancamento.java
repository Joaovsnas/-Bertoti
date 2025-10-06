public class PrecoLancamento implements CalculadoraPreco {
    @Override
    public double calcular(int diasAlugado) {
        return diasAlugado * 3;
    }
}
