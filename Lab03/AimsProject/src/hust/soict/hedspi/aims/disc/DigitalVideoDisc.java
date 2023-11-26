package hust.soict.hedspi.aims.disc;
import java.lang.String;
public class DigitalVideoDisc {
	public int id;
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    public DigitalVideoDisc( String category,String title, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
	}

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
	}
    public DigitalVideoDisc(String title) {
		super();
		this.title = title;
	}

    public String getTitle() {
        return title;
    }
    
	public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
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
    
    public int getId() {
    	return id;
    }
    
    public void setId(int id) {
    	this.id = id;
    }
    
    public void setLength(int length) {
        this.length = length;
    }
    
    public String toString() {
    	return "DVD - " + title + " - " + category + " - " + director + " - "+ length + ": " + cost + "$";
    }
    
    public boolean isMatch(String title) {
    	return this.getTitle().equals(title);
    }
}