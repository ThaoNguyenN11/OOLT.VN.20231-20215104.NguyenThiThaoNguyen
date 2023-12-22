package hust.soict.hedspi.aims.cart;

import hust.soict.hedspi.aims.media.DigitalVideoDisc;

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
    //method overloading
    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList){
        for(DigitalVideoDisc disc : dvdList){
            addDigitalVideoDisc(disc);
        }
        System.out.println("DVDs has been added to the cart");
    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2){
        addDigitalVideoDisc(dvd2);
        addDigitalVideoDisc(dvd2);
    }
    //calculate total cost in the cart
    public float totalCost() {
        for(int i = 0; i < itemsOrdered.size(); i++) {
            totalCost += itemsOrdered.get(i).getCost();
        }
        return totalCost;
    }

    public void printCartItems() {
        for(int i = 0; i < itemsOrdered.size(); i++) {
            System.out.println(i + 1 + itemsOrdered.get(i).getTitle()  +itemsOrdered.get(i).getCost());
        }
    }

    //print list of ordered
    public void printCart(){
        System.out.println("********************CART******************");
        System.out.println("Ordered Items: ");
        for(int i < 0; i < qtyOrdered; i++){
            DigitalVideoDisc dvd = itemsOrdered.get(i);
            System.out.printf("%d. DVD - %s - %s - %s - %d minutes: %.2f $\n", i +1, dvd.getTitle(), dvd.getCategory(), dvd.getDirector(), dvd.getLength(), dvd.getCost());
        }
        float totalCost = totalCost();
        System.out.printf("Total cost: %.2f $\n", totalCost);
    }

    //search by id
    public boolean searchID(int id){
        int n = qtyOrdered;
        for(int i = 0; i < n; i++){
            if(itemsOrdered.get(i).getId() == id){
                return true;
            }
        }
        return false;
    }

    //search by title
    public boolean searchTitle(String title){
        int n = qtyOrdered;
        for(int i = 0; i < n; i++){
            if(itemsOrdered.get(i).getTitle() == title){
                return true;
            }
            return false;
        }
    }
}
