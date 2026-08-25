package A2;

public class Main {
}

/*
Students should start by writing a Song class
    - stores a title,
    - an artist, and
    - a duration in minutes,

        - along with a constructor and getters for each field.

The Playlist class should be written as an abstract class rather than a regular class,
    -no playlist should ever be instantiated directly.

Playlist should store a name and a list of songs,
    -provide concrete methods for addSong and removeSong,
    since those behaviors are the same no matter what kind of playlist it is.

    the method playAllSongs should be declared abstract,
    along with a second method called getVibe that returns a short description of the playlist's style.
Because these two methods are abstract, every subclass is required to provide its own version of them rather than inheriting default behavior.

Students should then write three subclasses:
PopPlaylist, RockPlaylist, and JazzPlaylist.
Each of these must extend Playlist and must override playAllSongs and getVibe with behavior that reflects that genre.
Students are free to add extra methods or fields to any of these subclasses if it makes sense for the behavior they're implementing.

Finally, students should write a User class that stores a username and a list of playlists.
This class needs a method called createPlaylist that builds a playlist of a given type based on a string argument,
    a method called deletePlaylist that removes a playlist, and
    methods for adding and removing songs from a specific playlist.

The main method should simulate a user creating a few playlists of different types,
    adding songs to each one, and then looping through the user's playlists and calling playAllSongs on each.
        Because each playlist type overrides that method differently,
        --this loop is where students will actually see polymorphism happen
            -the same line of code produces different behavior depending on which subclass is stored in the list.

        As with Program 1, each class should be written in its own file.
 */
