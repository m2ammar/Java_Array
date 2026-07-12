import java.util.Scanner;

public class PracticeF {
    public  static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int sum=0;

        System.out.println("Enter rows for matrix");
        int rows=sc.nextInt();

        System.out.println("Enter column");
        int col=sc.nextInt();

        int[][] matrix= new int[rows][col];

        for(int i=0; i<rows; i++){
            System.out.println("Enter row"+(i+1)+" :");
            for(int j=0; j<col; j++){
                matrix[i][j]=sc.nextInt();
                sum+=matrix[i][j];
            }
        }

        for(int i=0; i<rows; i++){
            for(int j=0; j<col; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Sum is: "+sum);

        //max
        int max=matrix[0][0];
        for(int i=0; i<rows; i++){
            for(int j=0; j<col; j++){
                if(matrix[i][j]>max){
                    max=matrix[i][j];
                }
            }
        }
        System.out.println("Highest Element: "+max);

        //min
        int min=matrix[0][0];
        for(int i=0; i<rows; i++){
            for(int j=0; j<col; j++){
                if(matrix[i][j]<min){
                    min=matrix[i][j];
                }
            }
        }
        System.out.println("Lowest Element: "+min);

    }
}
