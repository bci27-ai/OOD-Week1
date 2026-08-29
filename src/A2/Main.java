package A2;

public class Main {

    public static void main(String[] args){

        PopPlaylist pop = new PopPlaylist("Pop");
        JazzPlaylist jazz = new JazzPlaylist("Jazz");
        RockPlaylist rock = new RockPlaylist("Rock");

        Song one = new Song("99 -Red Baloons","Nina",2.56);
        Song two = new Song("Chicken Dance","Rooster",2.16);
        Song three = new Song("Oh Here she comes","George Michael",1.59);
        Song four = new Song("It made the Frogs Gay","Joe Rogan",2.46);
        Song five = new Song("HighWay to the DangerZone","AeroSmith",3.26);


        //User.createPlaylist();
        //add all for speed:
        pop.addSong(three);
        pop.addSong(four);

        pop.addSong(one);
        pop.getVibe();
        pop.playAllSongs();
        pop.removeSong(one);

        jazz.addSong(two);
        jazz.getVibe();
        jazz.playAllSongs();
        jazz.removeSong(two);

        rock.addSong(five);
        rock.getVibe();
        rock.playAllSongs();
        rock.removeSong(five);

    }
}

/*


Students should then write three subclasses:
PopPlaylist, RockPlaylist, and JazzPlaylist.
Each of these must extend Playlist and must override playAllSongs and getVibe with behavior that reflects that genre.
Students are free to add extra methods or fields to any of these subclasses if it makes sense for the behavior they're implementing.

The main method should simulate a user creating a few playlists of different types,
    adding songs to each one, and then looping through the user's playlists and calling playAllSongs on each.
        Because each playlist type overrides that method differently,
        --this loop is where students will actually see polymorphism happen
            -the same line of code produces different behavior depending on which subclass is stored in the list.

        As with Program 1, each class should be written in its own file.
 */
