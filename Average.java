import java.util.*;
public class Average {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        float  sum=0;
        int n = s.nextInt();
        for(int i=1; i<=n;i++){
            System.out.println("  Entered the "+i+" number");
            sum+=i;

        }
        float average;
        System.out.println("the sum is "+sum);
        average = sum/n;
        System.out.println("The Average is "+average);
    }
}
