import java.util.Scanner;

public class Switch {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.println(" Enter a button");
        int button = s.nextInt();
        switch(button){
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println(" Namaste ");
                break;
            case 3:
                System.out.println("Bonjour");
                break;
            default:
                System.out.println(" please Enter a valid button");
        }

    }
}
