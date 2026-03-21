package lesson17HW.adapter;

class MediaAdapter implements MediaPlayer {
    private final OldPlayer oldPlayer;

    public MediaAdapter(OldPlayer oldPlayer) {
        this.oldPlayer = oldPlayer;
    }

    public void play(String fileName) {
        oldPlayer.playFile(fileName);
    }
}
