import java.util.*;
public class DoWhileLoops {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int i=0, n = s.nextInt();
        do{
            System.out.println(" Hello World");
            i++;
        }while(i<n);

    }
}
