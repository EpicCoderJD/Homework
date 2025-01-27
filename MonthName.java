import java.util.*;
public class MonthName {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter A month number between 1 to 12 ");
        int month = s.nextInt();
        switch(month){
            case 1: System.out.println("The Month Name is January ");
                break;
            case 2: System.out.println("The Month Name Febuary");
                break;
            case 3: System.out.println("The Month Name is March");
                break;
            case 4: System.out.println("The Month Name is April");
                break;
            case 5: System.out.println("The Month Name is May");
                break;
            case 6: System.out.println(" The Month Name is June");
                break;
            case 7: System.out.println("The Month Name is July");
                break;
            case 8: System.out.println("The Month Name is Agusth");
                break;
            case 9: System.out.println(" The Month Name is September");
                break;
            case 10: System.out.println(" The Month Name is October");
                break;
            case 11: System.out.println(" The Month Name is November");
                break;
            case 12: System.out.println(" The Month Name is December");
                break;
            default: System.out.println(" Enter a valid Month Number");
        }

    }
}
