import java.util.Scanner;
public class SolveEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Equation Solver Program");
        System.out.println("1. Solve a first-degree equation with one variable");
        System.out.println("2. Solve a system of first-degree equations with two variables");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                solveFirstDegreeEquation();
                break;
            case 2:
                solveLinearSystem();
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
    private static void solveFirstDegreeEquation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the coefficient a: ");
        double a = scanner.nextDouble();

        if (a == 0) {
            System.out.println("Coefficient 'a' cannot be zero for a first-degree equation.");
            return;
        }

        System.out.print("Enter the constant term b: ");
        double b = scanner.nextDouble();
        double x = -b / a;
        System.out.println("The solution for the equation " + a + "x + " + b + " = 0 is: x = " + x);
    }
    private static void solveLinearSystem() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the coefficients a11, a12, b1 for the first equation (a11x1 + a12x2 = b1): ");
        double a11 = scanner.nextDouble();
        double a12 = scanner.nextDouble();
        double b1 = scanner.nextDouble();

        System.out.print("Enter the coefficients a21, a22, b2 for the second equation (a21x1 + a22x2 = b2): ");
        double a21 = scanner.nextDouble();
        double a22 = scanner.nextDouble();
        double b2 = scanner.nextDouble();

        double determinant = a11 * a22 - a12 * a21;

        if (determinant == 0) {
            if (b1 == b2 && b1 == 0) {
                System.out.println("The system has infinitely many solutions.");
            } else {
                System.out.println("The system has no solution.");
            }
        } else {
            double x1 = (a22 * b1 - a12 * b2) / determinant;
            double x2 = (a11 * b2 - a21 * b1) / determinant;
            System.out.println("The solutions for the system are: x1 = " + x1 + ", x2 = " + x2);
        }
    }
}