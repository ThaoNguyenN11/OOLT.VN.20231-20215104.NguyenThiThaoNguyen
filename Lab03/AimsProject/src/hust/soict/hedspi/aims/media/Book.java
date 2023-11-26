package hust.soict.hedspi.aims.media;
import java.util.ArrayList;
public class Book {
	private int id;
	private String title;
	private String category;
	private float cost;
	private ArrayList<String> authors = new ArrayList<String>();
	
	public Book() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public ArrayList<String> getAuthors() {
		return authors;
	}

	public void setAuthors(ArrayList<String> authors) {
		this.authors = authors;
	}
	
	public void addAuthors(String authorName) {
		if(!authors.contains(authorName)) authors.add(authorName);
	}
	
	public void removeAuthors(String authorName) {
		if(authors.contains(authorName)) authors.remove(authorName);
	}
}
