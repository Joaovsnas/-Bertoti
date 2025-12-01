class PlayerAdapter implements Player {

    private AdvancedPlayer advancedPlayer;

    public PlayerAdapter(AdvancedPlayer advancedPlayer) {
        this.advancedPlayer = advancedPlayer;
    }

    @Override
    public void reproduzir(String arquivo) {
        advancedPlayer.tocarArquivo(arquivo);
    }
}
