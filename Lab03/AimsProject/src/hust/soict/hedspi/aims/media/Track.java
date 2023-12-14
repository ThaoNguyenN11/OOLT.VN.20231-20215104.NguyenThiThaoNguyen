package hust.soict.hedspi.aims.media;

public class Track  implements Playable{
	private String title;
	private int length;
	public Track() {
		// TODO Auto-generated constructor stub
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}
	
	public boolean equalsTrack(Track track1, Track track2){
		if(track1.getLength()==track2.getLength()&& track1.getTitle().equals(track2.getTitle())) return true;
		return false;
	}
}
