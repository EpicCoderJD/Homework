import java.util.*;
public class ProductCount {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the numbers");
        int n = sc.nextInt();
        int product= 1;
        while(n != 0){
            if(product==0){
                System.out.println(" product is zero becouse its one digit zero");
                product=0;
                break;
            }
            product = product *(n%10);
            n = n/10;
        }
        if(product!=0) {
            System.out.println(product);
        }
    }
}
