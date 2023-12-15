import java.util.Scanner;

public class AddMatrix {
    public static void main(String[] args) {

        int[][] matrix1;
        int[][] matrix2;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows in the matrix: ");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of columns in the matrix: ");
        int columns = scanner.nextInt();

        matrix1 = new int[rows][columns];
        matrix2 = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println("Enter the element at row " + i + " and column " + j + " of matrix 1: ");
                matrix1[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println("Enter the element at row " + i + " and column " + j + " of matrix 2: ");
                matrix2[i][j] = scanner.nextInt();
            }
        }

        int[][] sumMatrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }


        System.out.println("Sum matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}

