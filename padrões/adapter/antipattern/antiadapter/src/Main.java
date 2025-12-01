public class Main {
    public static void main(String[] args) {
        AdapteeA a = new AdapteeA();
        AdapteeB b = new AdapteeB();
        Target t = new BadAdapter(a, b);
        t.executar("teste");
    }
}
