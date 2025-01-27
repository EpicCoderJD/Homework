import java.util.*;
public class AreaTriangle {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println(" enter base and height");
       int base = sc.nextInt();
       int height = sc.nextInt();
       double  area = (base*height)/2.0;
        System.out.println("Area is :   "+area);
    }
}
