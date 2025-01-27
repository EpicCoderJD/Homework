import java.util.*;
public class SumofNaturalNumbers {
    public static void main(String[]args){
       Scanner s = new Scanner(System.in);

       // print the sum of First N natural numbers
       System.out.println(" Enter a number");
       int sum=0;
       int n = s.nextInt();
       for(int i=1; i<=n; i++){
           sum+=i;
           System.out.println(sum);
       }

    }
}
