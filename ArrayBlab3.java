import java.util.Random;
import java.util.Scanner;

public class ArrayBlab3 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        Random random=new Random();
        int size=10;
        int[] a= new int[size];
        for(int i=0; i<a.length; i++){
            a[i]= random.nextInt(100);
        }
        for(int j=0; j<a.length; j++){
            System.out.println(a[j]);
        }

        //Task: I want to add a list of arrays based on words or characters.

    }
}
