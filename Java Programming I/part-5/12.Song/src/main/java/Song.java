
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    public boolean equals(Object compared) {
        if (!(compared instanceof Song)) {
            return false;
        }
        if (this == compared) {
            return true;
        }

        Song comparedSong = (Song) compared;

        if (this.artist == comparedSong.artist && this.durationInSeconds == comparedSong.durationInSeconds
                && this.name == comparedSong.name) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }

}
