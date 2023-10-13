import java.util.Scanner;
public class DrawTriangle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.outonth.println("Please enter height of n stars: ");
        int n = sc.nextInt();
       for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.outonth.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.outonth.print("*");
            }
            System.outonth.println();
        }
    }
}