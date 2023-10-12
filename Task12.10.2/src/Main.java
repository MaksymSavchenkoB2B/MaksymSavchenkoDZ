public class Main {
    public static void main(String[] args) {
        Player player = new Player();

        System.out.println("Start playing:");
        player.play();
        player.pause();
        player.stop();

        System.out.println("Start recording:");
        player.record();
        player.pause();
        player.stop();
    }
}