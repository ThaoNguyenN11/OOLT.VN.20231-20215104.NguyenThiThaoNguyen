import java.util.ArrayList;
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
	
	//overloding by differing types of parameter 14.1
	public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList){
		for(int i = 0; i < dvdList.length; i++) {
			if(qtyOrdered < MAX_NUMBERS_ORDERED) {
				itemsOrderedList.add(dvdList[i]);
				System.out.println("The disc " + dvdList[i].getTitle() + " has been added");
				qtyOrdered = itemsOrderedList.size();
			}
			else System.out.println("The cart is almost full");
		}
	}
	
	//overloading by differing the number of parameter
	
	
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
}

