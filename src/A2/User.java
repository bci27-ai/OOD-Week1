package A2;

import java.util.ArrayList;

public class User {

    private String username;
    private ArrayList<Playlist> playlistGroup = new ArrayList<>();
    // group of playlists etc
    public User(String username ){
        this.username = username;
    }

    public void createPlaylist(String type, String name){
        Playlist p;

        if(type.equalsIgnoreCase("pop")){
            p = new PopPlaylist(name);
        }
        else if (type.equalsIgnoreCase("jazz")) {
            p = new JazzPlaylist(name);
        } else if (type.equalsIgnoreCase("Rock")) {
            p = new RockPlaylist(name);
        }
        else {
            System.out.println("Broken no laylist");
        }
        // add exception or smt for 29
        //playlistGroup.add(p);
    }
    // array and list logic. ask list of lists ? array of three, or so or array list of arraylists?
    // like 2d array or something?

    // this is in the
    public void addSong(Playlist song){
        playlistGroup.add(song);
        //ARRAYNAME  .add(song)
    }

    public void removeSong(Song song){
        playlistGroup.remove(song);
        // ARRAYNAME .remove(song)
    }

    public void deletePlaylist(Playlist playlist){
        playlistGroup.remove(playlist);
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