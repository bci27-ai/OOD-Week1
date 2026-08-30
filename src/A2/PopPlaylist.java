package A2;

public class PopPlaylist extends Playlist {

    public PopPlaylist(String name) {
        super(name);
    }

    //pop array
    @Override
    public void playAllSongs() {
        System.out.println("Playing " + "Pop" + " playlist: ");

        // play all Pop songs
        for(Song s : allSongs){
            System.out.println("Now Playing: " + s.getTitle() + " by "+ s.getArtist());
            System.out.println(" Duration: " + s.getDuration());
            System.out.println("---------- ----------");
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
