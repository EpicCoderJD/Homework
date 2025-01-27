import java.sql.SQLOutput;
import java.util.*;
import java.lang.*;
public class MinuteorJava {
    public static void main(String[]args){
        String convert;
        double number;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter numbers");
        number = sc.nextDouble();
        sc.nextLine();


        System.out.println("enter converting type");
        convert = sc.nextLine();

        if(convert.equals("minute")){
            number = number / 60;
            System.out.println("  total minute is: "+number);
        }
        else if(convert.equals("second")){
            number = number * 60;
            System.out.println(" total second is: "+number);
        }
        else{
            System.out.println(" enter a valid converting type");
        }







    }
}
