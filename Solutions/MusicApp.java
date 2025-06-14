class song{
    String title;
    String artist;

      public song(String title, String artist) {
        this.title = title;
        this.artist = artist;
      }
      public void play() {
        System.out.println("Playing song: " + title + " by " + artist);
      }

}
class PopSong extends song {
    private String coresound;
    private String album;

    public PopSong(String title, String artist, String album, String coresound) {
        super(title, artist);
        this.album = album;
        this.coresound = coresound;
    }

    @Override
    public void play() {
        super.play();
        System.out.println("Album: " + album);
        System.out.println("Core Sound: " + coresound);
    }
}
class RockSong extends song {
    private String band;

    public RockSong(String title, String artist, String band) {
        super(title, artist);
        this.band = band;
    }

    @Override
    public void play() {
        super.play();
        System.out.println("Band: " + band);
    } 
}
class JazzSong extends song {
    private String style;

    public JazzSong(String title, String artist, String style) {
        super(title, artist);
        this.style = style;
    }

    @Override
    public void play() {
        super.play();
        System.out.println("Style: " + style);
    }
}




public class MusicApp {
    public static void main(String[] args) {
       song[] songs = new song[3];
        songs[0] = new PopSong("Shape of You", "Ed Sheeran", "Divide", ".......");
        songs[1] = new RockSong("Bohemian Rhapsody", "Queen", "Queen");
        songs[2] = new JazzSong("Take Five", "Dave Brubeck", "Cool Jazz");
        for (song s : songs) {
            s.play();
        }
    }

    
}
