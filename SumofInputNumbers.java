import java.util.*;
public class SumofInputNumbers {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
         int sum=0;
        while(n!=0){
            sum = sum+n%10;
            n = n/10;
        }

        System.out.println(sum);
        System.out.println(n);
    }
}
