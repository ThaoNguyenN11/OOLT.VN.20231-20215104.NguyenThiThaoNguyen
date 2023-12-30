package hust.soict.hedspi.store;

import hust.soict.hedspi.aims.media.DigitalVideoDisc;

public class Store {
    public static final int MAX_NUMBERS_DVD = 100;
    private DigitalVideoDIsc itemsInStore[] = new DigitalVideoDIsc[MAX_NUMBERS_DVD];
    private int qtyOrdered = 0;
    public int getQtyOrdered(){
        return qtyOrdered;
    }
    public void setQtyOrdered(int n){
        qtyOrdered += n;
    }
    public void addDVD(DigitalVideoDisc disc){
        if(this.getQtyOrdered() != 100){
            itemsInStore[this.getQtyOrdered()] = disc;
            setQtyOrdered();
            System.out.println("The disc " + disc.getTitle() + "has been added");
        }
        else{
            System.out.println("Almost full");
        }
    }

    public void removeDVD(DigitalVideoDisc disc){
        for(int i = 0; i < qtyOrdered; i++){
            if(itemsInStore[i].getTitle() == disc.getTitle()){
                for( int j = i; j < qtyOrdered; j++){
                    itemsInStore[j] = itemsInStore[j + 1];
                }
                i--;
                setQtyOrdered();
                system.out.println("The disc " + disc.getTitle() + " has been removed");
            }
        }
    }
}
