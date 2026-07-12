public class ArrayBLab4 {
    public static void main(String[] args){
        int[] num={2,4,5,7,8,9,5,4,2,1};
        int sum=0;
        double aver=0;
        int max=num[0];
        int min=num[0];
        int temp=0;
        int countEven=0;
        int countOdd=0;

        for(int i=0; i<num.length; i++){
            sum +=num[i];
        }
        aver=sum/10.0;
        System.out.println("Sum is "+sum);
        System.out.println("Average is "+aver);

        //max, ini, even, odd
        for(int i=0; i<num.length; i++){
             if(num[i] > max){
                max = num[i];
            }

            if(num[i] < min){
                min = num[i];
            }

            if(num[i] % 2==0){
                countEven++;
            }else {
                countOdd++;
            }
        }
        System.out.println("Largest number is "+max);
        System.out.println("Smallest number is "+min);
        System.out.println("Total even numbers are "+countEven);
        System.out.println("Total odd numbers are "+countOdd);



        //Reverse
        for(int i = num.length - 1; i >= 0; i--){
            System.out.print(num[i] + " ");
        }
    }
}
