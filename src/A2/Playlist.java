package A2;

public abstract class Playlist {

    private String name;
    // list of sogs

    public void addSong(){

    }

    public void removeSong(){

    }

    public abstract void playAllSongs();

    public abstract String getVibe();
    // String with short dec for style




}

/*

Playlist should store a name and a list of songs,
    -provide concrete methods for addSong and removeSong,
    since those behaviors are the same no matter what kind of playlist it is.

    the method playAllSongs should be declared abstract,
    along with a second method called getVibe that returns a short description of the playlist's style.


Because these two methods are abstract,
every subclass is required to provide its own version of them rather than inheriting default behavior.

 */
