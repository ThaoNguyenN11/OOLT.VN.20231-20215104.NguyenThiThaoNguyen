package hust.soict.hedspi.aims.media;
import java.util.ArrayList;
public class Book extends Media{
	private ArrayList<String> authors = new ArrayList<String>();
	
	public Book(int id, String title, String category, float cost, ArrayList<String> authors)
	{ 
		super(id, title, category, cost);
		this.authors = authors;
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
