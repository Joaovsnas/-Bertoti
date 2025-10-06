public class Main {
    public static void main(String[] args) {
        Filme filme1 = new Filme("Robaro D' Novo II", new PrecoComum());
        Filme filme2 = new Filme("Bola na Area do Trikas 3: O gol agora é outro", new PrecoInfantil());
        Filme filme3 = new Filme("Palmeiras: Só na base do apito", new PrecoLancamento());

        int dias = 51;

        System.out.println(filme1.getTitulo() + " - Alugado por " + dias + " dias: R$" + filme1.calcularPreco(dias));
        System.out.println(filme2.getTitulo() + " - Alugado por " + dias + " dias: R$" + filme2.calcularPreco(dias));
        System.out.println(filme3.getTitulo() + " - Alugado por " + dias + " dias: R$" + filme3.calcularPreco(dias));
    }
}
