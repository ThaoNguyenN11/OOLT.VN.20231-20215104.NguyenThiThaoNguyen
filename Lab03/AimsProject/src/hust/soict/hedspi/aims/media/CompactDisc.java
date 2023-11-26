package hust.soict.hedspi.aims.media;
import java.util.ArrayList;

public class CompactDisc extends Disc  implements Playable {
	private String artist;
	private ArrayList<Track> tracks = new ArrayList<Track>();
	
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	public void addTrack(Track track){
		if(!tracks.contains(track)) tracks.add(track);
	}
	public void removeTrack(Track track)
	{
		if(tracks.contains(track)) tracks.remove(track);
	}
	public int getLength()
	{
		if(!tracks.isEmpty()) return tracks.size();
		return 0;
	}
	public void play()
	{
		System.out.println("Artist : "+ this.artist);
		System.out.print("Track's play : \n");
		for(Track track: tracks)
		{
			track.play();
		}
	}
}
