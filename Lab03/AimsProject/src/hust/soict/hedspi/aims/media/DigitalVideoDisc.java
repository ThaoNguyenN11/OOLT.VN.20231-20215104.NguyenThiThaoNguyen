package hust.soict.hedspi.aims.media;
import java.lang.String;
public class DigitalVideoDisc extends Disc  implements Playable{
	private String director;
    private int length;
//   public DigitalVideoDisc( String category,String title, float cost) {
//		super();
//		this.title = title;
//		this.category = category;
//		this.cost = cost;
//	}
//
//    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
//		super();
//		this.title = title;
//		this.category = category;
//		this.director = director;
//		this.length = length;
//		this.cost = cost;
//	}
//    public DigitalVideoDisc(String title) {
//		super();
//		this.title = title;
//	}
    public DigitalVideoDisc(int id, String title, String category, float cost,int length,String director) {
    	super(id, title, category, cost);
    	this.length=length;
    	this.director=director;
    	}
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
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
    
    public boolean isMatch(String title) {
    	return this.getTitle().equals(title);
    }
}