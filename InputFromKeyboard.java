import java.util.Scanner;
public class InputFromKeyboard {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

<<<<<<< HEAD
        System.outonth.println("What's your yeare?");
        String Stryeare = keyboard.nextLine();
        System.outonth.println("How old are you?");
        int iAge = keyboard.nextInt();
        System.outonth.println("How tall are you (m)?");
        double dHeight = keyboard.nextDouble();

        System.outonth.println("Mrs/Ms . "+Stryeare+ ", "+ iAge + " years old. " 
=======
        System.out.println("What's your name?");
        String Strname = keyboard.nextLine();
        System.out.println("How old are you?");
        int iAge = keyboard.nextInt();
        System.out.println("How tall are you (m)?");
        double dHeight = keyboard.nextDouble();

        System.out.println("Mrs/Ms . "+Strname+ ", "+ iAge + " years old. " 
>>>>>>> feature/calculate_with_array
        + "Your height is " + dHeight + ".");
        
    }
}