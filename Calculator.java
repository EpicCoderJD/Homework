import java.util.*;
public class Calculator {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number 1");
        float num1 = s.nextInt();
        System.out.println("Enter Number 2");
        float num2 = s. nextInt();
        System.out.println("Enter operation do you want to be performed");
        char op = s.next().charAt(0);
        switch(op){
            case '+': System.out.println("After Addition :"+num1+num2);
                    break;
            case '-': System.out.println("After Subtraction :"+(num1-num2));
                    break;
            case '*': if(num1 != 0) {
                    System.out.println("After Multiplication :" + num1 * num2);
            }else{
                System.out.println(" enter a valid value");
            }
                    break;
            case '/': if(num1 != 0) {
                System.out.println("After Division :" + num1 / num2);
            }else{
                System.out.println(" enter valid value");
            }
                    break;
            case '%': if(num1 != 0) {
                System.out.println("The Reminder is :" + num1 % num2);
            }else{
                System.out.println(" enter a valid number");
            }
                    break;
            default : System.out.println(" please enter valid operation");
        }

    }
}
