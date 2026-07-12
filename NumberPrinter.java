import java.util.Scanner;

public class NumberPrinter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter numbers");
        int n=sc.nextInt();


//       for(int i = 1; i <= n; i++){        // for each row
//            for(int j = 1; j <= i; j++){    // print numbers from 1 to i
//                System.out.print(j);
//            }
//            System.out.println();            // move to next line after each row
//        }n

        // Outer loop for rows
//        for (int i = n; i >= 1; i--) {
//            // Inner loop to print numbers from 1 to i
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j);
//            }
//            System.out.println(); // move to next line
////        }
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }

         for(int i=n; i>=1; i--){
             for(int j=1; j<=i; j++){
                 System.out.print(j);
             }
             System.out.println();
         }
    }
}
