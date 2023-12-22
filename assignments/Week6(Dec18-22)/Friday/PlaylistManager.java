package Friday;

import java.util.LinkedList;
import java.util.ListIterator;

public class PlaylistManager {
    
    private LinkedList<String> playlist;
    private ListIterator<String> playlistIterator;

    public PlaylistManager() {
        this.playlist = new LinkedList<>();
        this.playlistIterator = playlist.listIterator();
    }

    public void addSong(String song) {
        playlist.add(song);
        System.out.printf("%s was added to your playlist.%n", song);
    }

    public void play() throws InterruptedException {
        if (!playlist.isEmpty() && playlist != null) {
            playlistIterator = playlist.listIterator();
            while (playlistIterator.hasNext()) {
                System.out.println(playlistIterator.next());
                Thread.sleep(300);
            }
            System.out.println("The playlist is finished.");
            playlistIterator = playlist.listIterator();
        }
    }

    public void displayPlaylist() {
        if (!playlist.isEmpty() && playlist != null) {
            int playListId = 0;
            while (playlistIterator.hasNext()) {
                System.out.printf("%d %s%n", playListId++, playlistIterator.next());
            }
            playlistIterator = playlist.listIterator();
        }
    }

}