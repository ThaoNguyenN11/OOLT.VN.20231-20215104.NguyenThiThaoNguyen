package hust.soict.hedspi.aims.cart;

import java.util.ArrayList;

import hust.soict.hedspi.aims.media.DigitalVideoDisc;
public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private float totalCost = 0;
	ArrayList<DigitalVideoDisc> itemsOrderedList = new ArrayList<DigitalVideoDisc>(MAX_NUMBERS_ORDERED);
	public int qtyOrdered = 0;
	
	//add an item to the list
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered < MAX_NUMBERS_ORDERED) {
			itemsOrderedList.add(disc);
			System.out.println("The disc" + disc.getTitle() + " has been added");
			qtyOrdered = itemsOrderedList.size();
		}
		else
			System.out.println("The cart is almost full");
	}
	
	//remove the item from the list
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		itemsOrderedList.remove(disc);
		System.out.println("The disc " + disc.getTitle() + " has been removed");
		qtyOrdered = itemsOrderedList.size();
	}
	
	//calculate total cost in the cart
	public float totalCost() {
		for(int i = 0; i < itemsOrderedList.size(); i++) {
			totalCost += itemsOrderedList.get(i).getCost();
		}
		return totalCost;
	}	
	
	public void printCartItems() {
		for(int i = 0; i < itemsOrderedList.size(); i++) {
			System.out.println(i + 1 + itemsOrderedList.get(i).getTitle()  +itemsOrderedList.get
					(i).getCost());
		}
	}
	
	//4. Update the Cart class
	public void printCart() {
		System.out.println("******************CART******************");
		System.out.println("Ordered Items: ");
		for(int i = 0; i < qtyOrdered; i++) {
			DigitalVideoDisc dvd = itemsOrderedList.get(i);
			System.out.printf("%d. DVD - %s - %s - %s - %d minutes: %.2f $\n", i + 1, dvd.getTitle(), dvd.getCategory(), dvd.getDirector(), dvd.getLength(), dvd.getCost());
		}
		float totalCost = totalCost();
		System.out.printf("Total cost: %.2f $\n", totalCost);
		System.out.println("****************************************");
	}
	
	//Search for DVDs by ID
	public boolean searchID(int id) {
		for(int i = 0; i < qtyOrdered; i++) {
			if(itemsOrderedList.get(i).getId() == id) {
				return true;
			}
		}
		return false;
	}
	
	//Search for DVDs by Title
	public boolean searchTitle(String title) {
		for(int i = 0; i < qtyOrdered; i++) {
			if(itemsOrderedList.get(i).getTitle() == title) {
				return true;
			}
		}
		return false;
	}
}