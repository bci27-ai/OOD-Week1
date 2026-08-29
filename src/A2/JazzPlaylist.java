package A2;

public class JazzPlaylist extends Playlist{

    public JazzPlaylist(String name) {
        super(name);
    }

    ////Jazz array
    @Override
    public void playAllSongs() {
        // play all Jazz songs
        for(Song s : allSongs){
            System.out.println("Now Playing: " + allSongs);
        }
    }

    @Override
    public String getVibe() {
        return "Jazzin Awaay!";
    }
}

/*
Students should then write three subclasses:
PopPlaylist, RockPlaylist, and JazzPlaylist.
Each of these must extend Playlist and must override playAllSongs and getVibe with behavior that reflects that genre.
Students are free to add extra methods or fields to any of these subclasses if it makes sense for the behavior they're implementing.
 */
