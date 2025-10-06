public class Filme {
    public static final int COMUM = 0;
    public static final int LANCAMENTO = 1;
    public static final int INFANTIL = 2;

    private String titulo;
    private int tipo;

    public Filme(String titulo, int tipo) {
        this.titulo = titulo;
        this.tipo = tipo;
    }

    public String getTitulo() {
        return titulo;
    }

    public double calcularPreco(int diasAlugado) {
        double preco = 0;

        switch (tipo) {
            case COMUM:
                preco = 2;
                if (diasAlugado > 2) {
                    preco += (diasAlugado - 2) * 1.5;
                }
                break;

            case LANCAMENTO:
                preco = diasAlugado * 3;
                break;

            case INFANTIL:
                preco = 1.5;
                if (diasAlugado > 3) {
                    preco += (diasAlugado - 3) * 1.5;
                }
                break;

            default:
                throw new IllegalArgumentException("Tipo de filme inválido");
        }

        return preco;
    }
}
