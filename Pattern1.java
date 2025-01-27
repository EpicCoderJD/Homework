import java.util.*;
public class Pattern1 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
//        for(int i =1; i<=4; i++){
//            for(int j=1; j<=5;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        System.out.println(" Enter N and M count for printing * ");
        int n=s.nextInt(),m=s.nextInt();
        for(int i =1; i<=n; i++){
            for(int j=1; j<=m;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
