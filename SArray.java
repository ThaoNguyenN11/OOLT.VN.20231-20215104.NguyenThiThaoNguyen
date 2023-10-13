import java.util.Arrays;
import java.util.Scanner;

public class SArray {
    public static void main(String[] args) {
        int[] array;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();
        array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter the element at index " + i + ": ");
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);

        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += array[i];
        }
        double average = (double) sum / size;

        System.out.println("Sorted array: " + Arrays.toString(array));
        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average value of array elements: " + average);

    }
}