import java.util.*;
public class Marksheet {
    public static void main(String[]args)
    {
        Scanner  s = new Scanner(System.in );
        int mark;
        System.out.println(" enter a mark");
        mark = s.nextInt();
        if((mark >= 90)&&(mark<=100))
        {
            System.out.println(" A+");
        }
        else if ((mark >= 80)&& (mark <90))
    {
        System.out.println("A");
    }
    else if((mark >= 60)&&(mark < 80)){
        System.out.println(" B ");
    }
    else if((mark >= 40)&&(mark <60)){
        System.out.println(" C");
    }
    else if (mark <40){
        System.out.println("Fail");
    }
    else{
        System.out.println(" please enter a valid number ");
    }


    }
}
