package A2;

import java.util.ArrayList;

public class PopPlaylist extends Playlist {

    private ArrayList<Playlist> Pop = new ArrayList<>();

    public PopPlaylist(String name) {
        super(name);
    }

    //pop array
    @Override
    public void playAllSongs() {
        // play all Pop songs
        for(Playlist p : Pop){
            System.out.println("Now Playing: " + Pop);
        }
    }

    @Override
    public String getVibe() {
        return "Popping the rocks!";
    }
}

/*
Students should then write three subclasses:
PopPlaylist, RockPlaylist, and JazzPlaylist.
Each of these must extend Playlist and must override playAllSongs and getVibe with behavior that reflects that genre.
Students are free to add extra methods or fields to any of these subclasses if it makes sense for the behavior they're implementing.
 */
