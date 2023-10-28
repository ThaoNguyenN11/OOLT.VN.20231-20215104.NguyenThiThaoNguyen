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

////////////////////

public class TestPassingParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
		DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
		
		swap(jungleDVD, cinderellaDVD);
		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
		System.out.println("cinderella dvd title: "+ cinderellaDVD.getTitle());
		
		changeTitle(jungleDVD, cinderellaDVD.getTitle());
		System.out.println("jungle dvd title: "+ jungleDVD.getTitle());
	}
	
	public static void swap(Object o1, Object o2) {
		Object tmp = o1;
		o1 = o2;
		o2 = tmp;
	}
	
	public static void changeTitle(DigitalVideoDisc dvd, String title) {
		String oldTitle = dvd.getTitle();
		dvd.setTitle(title);
		dvd = new DigitalVideoDisc(oldTitle);
	}
	
	public static void newSwap(DigitalVideoDisc Object1, DigitalVideoDisc Object2) {
		String tmpString = Object1.getTitle(); 
		Object1.setTitle(Object2.getTitle());    
		Object2.setTitle(tmpString);
	}
	
}
