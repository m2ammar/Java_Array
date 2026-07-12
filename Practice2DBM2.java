import java.util.Scanner;

public class Practice2DBM2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int row = sc.nextInt();

        System.out.print("Enter columns: ");
        int col = sc.nextInt();

        int[][] matrix = new int[row][col];

        // Input
        for (int i = 0; i < row; i++) {
            System.out.println("Enter elements of row " + (i + 1) + ":");
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Sum of each row
        System.out.println("\nSum of each row:");
        for (int i = 0; i < row; i++) {
            int rowSum = 0;
            for (int j = 0; j < col; j++) {
                rowSum += matrix[i][j];
            }
            System.out.println("Row " + (i + 1) + " sum = " + rowSum);
        }

        // Sum of each column
        System.out.println("\nSum of each column:");
        for (int j = 0; j < col; j++) {
            int colSum = 0;
            for (int i = 0; i < row; i++) {
                colSum += matrix[i][j];
            }
            System.out.println("Column " + (j + 1) + " sum = " + colSum);
        }
    }
}
