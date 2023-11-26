package hust.soict.hedspi.aims.store;
import java.util.ArrayList;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
public class Store {
//	ArrayList<DigitalVideoDisc> itemsInStore = new ArrayList<DigitalVideoDisc>();
//	
//	public void removeDVD(DigitalVideoDisc disc) {
//		itemsInStore.remove(disc);
//		System.out.println("The disc " + disc.getTitle() + " has been removed");
//	}
//
//	public void addDVD(DigitalVideoDisc disc) {
//			itemsInStore.add(disc);
//			System.out.println("The disc " + disc.getTitle() + " has been added");
//	}
//	
	public  ArrayList<Media> itemsInStore = new ArrayList<Media>();
	
	public void addMedia(Media dvd)
	{
		itemsInStore.add(dvd);
	}
	
	public void removeMedia(Media dvd)
	{
		itemsInStore.remove(dvd);
	}
	
}
