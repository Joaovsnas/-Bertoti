public class Main {
    public static void main(String[] args) {
        Filme filme1 = new Filme("Matrix", Filme.COMUM);
        Filme filme2 = new Filme("Frozen", Filme.INFANTIL);
        Filme filme3 = new Filme("Vingadores: Ultimato", Filme.LANCAMENTO);

        int dias = 4;

        System.out.println(filme1.getTitulo() + " - Alugado por " + dias + " dias: R$" + filme1.calcularPreco(dias));
        System.out.println(filme2.getTitulo() + " - Alugado por " + dias + " dias: R$" + filme2.calcularPreco(dias));
        System.out.println(filme3.getTitulo() + " - Alugado por " + dias + " dias: R$" + filme3.calcularPreco(dias));
    }
}
