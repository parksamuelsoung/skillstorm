package Friday;

public class PlayListManagerTest {
    
    public static void main(String[] args) throws Exception{
        PlaylistManager playlistManager = new PlaylistManager();

        playlistManager.addSong("Song");
        playlistManager.addSong("Song Song");
        playlistManager.addSong("Song Song Song");

        playlistManager.play();

        playlistManager.displayPlaylist();
    }
}
