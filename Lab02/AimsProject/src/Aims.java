public class Aims {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //create a new cart
        Cart anOrder = new Cart();

        //create new dvd object and add them to the cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animatin", "Roger Allers", 87, 19.95f);
        anOrder.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 97, 24.95f);
        anOrder.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        anOrder.addDigitalVideoDisc(dvd3);
        //print total cost of the items in the cart
        System.out.println("Total cost is: ");
        System.out.println(anOrder.totalCost());


        DigitalVideoDisc[] dvdList = {dvd1, dvd2, dvd3};
        anOrder.addDigitalVideoDisc(dvdList);

        anOrder.addDigitalVideoDisc(dvd1, dvd2);

        anOrder.printCartItems();

    }
}