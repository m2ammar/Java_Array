import java.util.Scanner;

public class ArrayBLab5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] temperature=new int[7];
        String[] days={"Monday", "Tuesday", "Wednesday","Thursday","Friday","Saturday","Sunday"};
        double aver=0;
        int max;
        int min;
        int sum=0;

        for(int i=0; i<7; i++) {
            System.out.println("Enter " + days[i] + "'s Temperature ");
            temperature[i] = sc.nextInt();
            sum += temperature[i];
            System.out.println("Enter temperature "+temperature[i]);
        }

        max=temperature[0];
        min=temperature[0];
        for (int i = 1; i < temperature.length; i++) {
            if (temperature[i] > max) max = temperature[i];
            if (temperature[i] < min) min = temperature[i];
        }

        aver = sum / 7.0;

        System.out.println("Average temperature"+aver);
        System.out.println("Highest Temperature "+max);
        System.out.println("Lowest Temperature "+min);
    }
}
