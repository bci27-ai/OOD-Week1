package A2;

public class Song {

    private String title;
    private String artist;
    private double duration;
    // duration minutes

    public Song (String title, String artist, double duration){
        this.title = title;
        this.artist = artist;
        this.duration = duration;

    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public double getDuration() {
        return duration;
    }
}

/*
Students should start by writing a Song class
    - stores a title,
    - an artist, and
    - a duration in minutes,

        - along with a constructor and getters for each field.
 */