package A2;

import java.util.ArrayList;

public class User {

    private String username;
    private ArrayList<Playlist> playlistGroup = new ArrayList<>();
    // group of playlists etc
    public User(String username ){
        this.username = username;
    }

    public void createPlaylist(Song makePlaylist){
        playlistGroup.add(Playlist);
    }
    // array and list logic. ask list of lists ? array of three, or so or array list of arraylists?
    // like 2d array or something?

    // this is in the
    public void addSong(Song song){
        playlistGroup.add(song);
        //ARRAYNAME  .add(song)
    }

    public void removeSong(Song song){
        playlistGroup.remove(song);
        // ARRAYNAME .remove(song)
    }

    public void deletePlaylist(Song playlist){
        playlistGroup.remove(Playlist);
        //ARRAYNAME .remove(playlist)
    }
}


/*
User class
    -stores a username
    -list of playlists.

    - method createPlaylist that builds a playlist of a given type based on string argument,
    - method called deletePlaylist that removes a playlist,
    - methods adding and removing songs from a specific playlist.
 */