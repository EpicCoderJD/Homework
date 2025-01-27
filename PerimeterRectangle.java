import java.util.*;
public class PerimeterRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println(" enter length width ");
        int l = sc.nextInt();
        int w = sc.nextInt();
        int p;
        p = 2*(l+w);
        System.out.println(" perimeter is: "+p);
    }
}
