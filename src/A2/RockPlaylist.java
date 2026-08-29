package A2;

import java.util.ArrayList;

public class RockPlaylist extends Playlist{

    private ArrayList<Playlist> Rock = new ArrayList<>();
    ////Rock array
    @Override
    public void playAllSongs() {
        // play all Rock songs
        for(Playlist p : Rock){
            System.out.println("Now Playing: " + Rock);
        }
    }

    @Override
    public String getVibe() {
        return "Rockin it out!";
    }
}

/*
Students should then write three subclasses:
PopPlaylist, RockPlaylist, and JazzPlaylist.
Each of these must extend Playlist and must override playAllSongs and getVibe with behavior that reflects that genre.
Students are free to add extra methods or fields to any of these subclasses if it makes sense for the behavior they're implementing.
 */
