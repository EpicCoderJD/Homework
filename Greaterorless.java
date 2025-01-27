import java.util.*;
public class Greaterorless {
    public static void main(String[]args){
        Scanner s = new Scanner (System.in);
        int a,b;
        System.out.println("enter number a ");
        a = s.nextInt();
        System.out.println(" enter number b");
        b = s.nextInt();
        if(a>b){
            System.out.println(" a is greater than b");
        }
        else if(b>a){
            System.out.println(" b is graeter a");
        }
        else{
            System.out.println(" Both are equal");
        }
    }
}
