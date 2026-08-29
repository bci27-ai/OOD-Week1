package A2;
import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class Playlist {

    private String name;
    // list of sogs
    ArrayList<Song> AllSongs;


    public void addSong(Song song){
        AllSongs.add(song);

    }

    public void removeSong(Song song){
        AllSongs.remove(song);

    }

    public abstract void playAllSongs();

    public abstract String getVibe();
    // String with short dec for style




}

/*

The Playlist class should be written as an abstract class,
    -no playlist should ever be instantiated directly.

Playlist should store a name and a list of songs,
    -provide concrete methods for addSong and removeSong,
    since those behaviors are the same no matter what kind of playlist it is.

    the method playAllSongs should be declared abstract,
    along with a second method called getVibe that returns a short description of the playlist's style.
Because these two methods are abstract, every subclass is required to provide its own version of them rather than inheriting default behavior.

 */
