import java.util.*;
public class ForLoops {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        // print N times Hello world
        /*
        System.out.println(" enter a number ");
        int n = s.nextInt();
        for(int i=1; i<=n; i++){
            System.out.println(" Hello World ");
        } */

        // print 0 to N Numbers in for loop.

        System.out.println("Enter a number");
        int n = s.nextInt();
        for(int i = 0; i <= n; i++){
            System.out.println(i);
        }


    }
}
