import java.util.ArrayList;
public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private float totalCost = 0;
    ArrayList<DigitalVideoDisc> itemsOrdered = new ArrayList<DigitalVideoDisc>(MAX_NUMBERS_ORDERED);
    public int qtyOrdered = 0;
    //add an item to the list
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if(qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered.add(disc);
            System.out.println("The disc" + disc.getTitle() + " has been added");
            qtyOrdered = itemsOrdered.size();
        }
        else
            System.out.println("The cart is almost full");
    }

    //remove the item from the list
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        itemsOrdered.remove(disc);
        System.out.println("The disc " + disc.getTitle() + " has been removed");
        qtyOrdered = itemsOrdered.size();
    }


}