package lesson17HW.adapter;

public class Main {
    static void main() {
        MediaPlayer player = new MediaAdapter(new OldPlayer());
        player.play("song.mp3");
    }
}
