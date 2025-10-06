public class Filme {
    private String titulo;
    private CalculadoraPreco calculadora;

    public Filme(String titulo, CalculadoraPreco calculadora) {
        this.titulo = titulo;
        this.calculadora = calculadora;
    }

    public String getTitulo() {
        return titulo;
    }

    public double calcularPreco(int dias) {
        return calculadora.calcular(dias);
    }
}
