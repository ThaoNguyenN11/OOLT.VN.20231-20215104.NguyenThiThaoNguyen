package hust.soict.hedspi.aims.media;

public class Track implements Playable{
    private String title;
    private int length;

    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public void play() {
        System.out.println("Playing track: " + this.getTitle());
        System.out.println("Track length: " + this.getLength());
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Track)) return false;
        // 2 tracks are considered as identical if they have the same length and title
        return (((Track) o).getTitle().equals(title)
                && ((Track) o).getLength() == length);
    }
}
