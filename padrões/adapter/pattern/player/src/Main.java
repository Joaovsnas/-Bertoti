public class Main {
    public static void main(String[] args) {
        AdvancedPlayer externo = new AdvancedPlayer();
        Player player = new PlayerAdapter(externo);
        player.reproduzir("musica.mp3");
    }
}
