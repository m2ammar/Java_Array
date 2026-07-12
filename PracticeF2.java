import java.util.Scanner;

public class PracticeF2 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter rows for matrix");
        int rows=sc.nextInt();

        System.out.println("Enter column");
        int col=sc.nextInt();

        int[][] matrix= new int[rows][col];

        for(int i=0; i<rows; i++){
            System.out.println("Enter row"+(i+1)+" :");
            for(int j=0; j<col; j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        for(int i=0; i<rows; i++){
            for(int j=0; j<col; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        //row wise sum
        for(int i=0; i<rows; i++) {
            int sumR = 0;
            for(int j=0; j<col; j++){
                sumR +=matrix[i][j];
            }
            System.out.println("Sum of row"+(i+1)+" : "+sumR);
        }

        //transpose
        for(int i=0; i<col; i++){ //column
            for(int j=0; j<rows; j++){ //rows
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println();
        }

    }
}
