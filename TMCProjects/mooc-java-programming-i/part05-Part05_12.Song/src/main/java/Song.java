
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    public boolean equals(Object song) {
//        if (song instanceof Song)
        if (song instanceof Song) {
            if (
                    this.artist.equals(((Song) song).artist) &&
                            this.artist.equals(((Song) song).artist) &&
                            this.durationInSeconds == ((Song) song).durationInSeconds
            ) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }


}
