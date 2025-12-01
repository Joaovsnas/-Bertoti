class BadAdapter implements Target {

    private AdapteeA a;
    private AdapteeB b;

    public BadAdapter(AdapteeA a, AdapteeB b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void executar(String dado) {
        a.processar(dado);
        b.run(dado);
    }
}
