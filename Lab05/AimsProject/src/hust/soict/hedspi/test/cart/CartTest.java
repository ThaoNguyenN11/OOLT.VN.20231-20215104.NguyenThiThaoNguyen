package hust.soict.hedspi.test.cart;
import java.util.Scanner;
public class CartTest {
    Cart cart = new Cart();
    DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
    cart.addDigitalVideoDisc(dvd1);

    DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 97, 24.95f);
    cart.addDigitalVideoDisc(dvd2);

    DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
    cart.addDigitalVideoDisc(dvd3);

    cart.printCart();

    Scanner keyboard = new Scanner(System.in);
    int n = keyboard.nextInt();
    if(cart.searchID(n)){
        cart.printf(n);
    }
    else
        System.out.println("No result found");
}
