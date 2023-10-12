import java.util.Scanner;

public class CalculateNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first double number: ");
        String strNum1 = scanner.nextLine();
        double num1 = Double.parseDouble(strNum1);
       
	    System.out.println("Enter the second double number: ");
        String strNum2 = scanner.nextLine();
        double num2 = Double.parseDouble(strNum2);

        // Calculate the sum, difference, product, and quotient of the two double numbers
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;

        System.out.println("The sum of the two numbers is: " + sum);
        System.out.println("The difference of the two numbers is: " + difference);
        System.out.println("The product of the two numbers is: " + product);
        System.out.println("The quotient of the two numbers is: " + quotient);
        scanner.close();
    }
}
