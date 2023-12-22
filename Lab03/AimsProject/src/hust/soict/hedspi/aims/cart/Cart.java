package hust.soict.hedspi.aims.cart;

import hust.soict.hedspi.aims.media.DigitalVideoDisc;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
   //private float totalCost = 0;
    ArrayList<DigitalVideoDisc> itemsOrdered = new ArrayList<DigitalVideoDisc>(MAX_NUMBERS_ORDERED);
    public int qtyOrdered = 0;
    //add an item to the list
    /*public void addDigitalVideoDisc(DigitalVideoDisc disc) {
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
    */

    private List<Media> itemsOrdered = new ArrayList<>();

    public boolean addMedia(Media media) {
        if (itemsOrdered.size() == MAX_NUMBERS_ORDERED) {   // Check if the cart is full
            System.out.println("The cart is already full");
            return false;
        } else {
            itemsOrdered.add(media);
            System.out.println("Item added");
            return true;
        }
    }

    public boolean removeMedia(Media media) {
        if (!itemsOrdered.contains(media)) {    // Check if the item existed
            System.out.println("No such item found");
            return false;
        } else {
            itemsOrdered.remove(media);
            System.out.println("Item removed");
            return true;
        }
    }

    public float totalCost() {
        float sum = 0f;
        // Iterate over the whole list of ordered items and sum up the prices
        for (Media item : itemsOrdered) {
            sum += item.getCost();
        }
        return sum;
    }

    public Media search(int id) {
        for (Media item : itemsOrdered) {
            if (item.getId() == id) {   // Iterate over the ordered item list and check if there is an id matching
                System.out.println("Item found");    // Return the item that matches
                return item;
            }
        }
        System.out.println("No item found");
        return null;    // If there is no item found, inform and return null
    }

    public Media search(String title) {
        for (Media item : itemsOrdered) {   // Iterate over the ordered item list and check if there is title matching
            if (item.getTitle().equals(title)) {
                System.out.println("Item found");
                return item;    // Return the item that matches
            }
        }
        System.out.println("No item found");
        return null;    // If there is no item found, notify and return null
    }

    public void print() {
        System.out.println("*********************** CART ***********************");
        for (Media item : itemsOrdered) {
            System.out.println(item.toString());
        }
        System.out.println("Total cost: $" + totalCost());   // Show the total cost
        System.out.println("****************************************************");
    }

    public List<Media> getItemsOrdered() {
        return itemsOrdered;
    }
}
