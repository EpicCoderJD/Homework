import java.util.*;
public class Homework {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);

        // Qs.1 => Try to declare meaningful variables of each type. Eg - a variable
        // named age should be a numeric type (int or float) not byte.

        int age = 24;
        System.out.println(age);

        // Qs.2 => Make a program that takes the radius of a circle as input,
        // calculates its radius and area and prints it as output to the user
        // Area = ^r2 -> 3.14 * radius * radius.
    /*
        int r;
        double pi = 3.14,area;
        System.out.println(" enter radius");
        r = sc.nextInt();
        area = pi*r*r;
        System.out.println(" area of the circle is "+area); */

        // Qs.3 => Make a program that prints the table of a number that is input by the user.

         /*int table;
        System.out.println(" enter a table number");
        table = sc.nextInt();
        System.out.println("1 * table =" + table);
        System.out.println("2 * table =" +table*2);
        System.out.println("3 * table =" +table*3);
        System.out.println("4 * table =" +table*4);
        System.out.println("5 * table =" +table*5);
        System.out.println("6 * table =" +table*6);
        System.out.println("7 * table =" +table*7);
        System.out.println("8 * table =" +table*8);
        System.out.println("9 * table =" +table*9);
        System.out.println("10 * table =" +table*10); */
        int Age; ;
        System.out.println(" enter a  age ");
        Age = sc.nextInt();
        if(Age >= 18) {
            System.out.println("you are an adult");
        }
        else {
            System.out.println(" not adult");
        }
    }
}