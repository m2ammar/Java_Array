import java.util.Scanner;

public class PracticeF3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rows for matrix");
        int rows = sc.nextInt();

        System.out.println("Enter column");
        int col = sc.nextInt();

        int[][] matrix = new int[rows][col];

        for (int i = 0; i < rows; i++) {
            System.out.println("Enter row" + (i + 1) + " :");
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Enter a number to find the if it is present in the array or not");
        int num=sc.nextInt();
        boolean found = false;

        for(int i=0; i<rows; i++){
            for(int j=0; j<col; j++){
                if(num == matrix[i][j]){
                    System.out.println("Yes, the number is present in row " + (i+1) + " and column " + (j+1));
                    found = true;
                    break; // break inner loop
                }
            }
            if(found) break; // break outer loop if found
        }

        if(!found){
            System.out.println("Not present");
        }

    }
}
