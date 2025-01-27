import java. util.*;
public class SimpleInterest {
        public static void main(String[] args) {
            // we are going to write code for find simple interest
            float p,t,r, si;
            Scanner sc= new Scanner(System.in);
            System.out.println(" Enter the principle ");
            p = sc.nextFloat();
            System.out.println(" Enter period time");
            t = sc.nextFloat();
            System.out.println("Enter rate of interest");
            r = sc.nextFloat();
            sc.nextLine();
            System.out.println(" Enter time which is do  you want (Years, Months,Days)");
            String time = sc.nextLine();

            if(time.equals("years")){
                si = (p*t*r)/100;
                System.out.println(" Simple Interest is: " +si);
            }
            else if(time.equals("months")){
                si =(p*t*r)/1200;
                System.out.println(" Simple Interest is: " +si);
            }
            else if(time.equals("days")){
                si = (p*t*r)/36500;
                System.out.println(" Simple Interest is: " +si);
            }
            else{
                System.out.println(" please enter correct or valid time period");
            }



            // this part for  calculate interest rate of years

//            if(time.equals("years")){
//                System.out.println(" enter principle");
//                p = sc.nextFloat();
//                System.out.println(" enter time(years)");
//                t = sc. nextFloat();
//                System.out.println(" enter rate  of interest");
//                r = sc.nextFloat();
//                si = (p*t*r)/100;
//                System.out.println(" Simple interest is :" +si);
//                System.out.println(" Total Time :" +t+ "years");
//                System.out.println(" principle Amount :" +p);
//                System.out.println("Total Value :" + (p+si));
//            }
//
//            // this part for calculate interest rate of months
//
//            else if(time.equals("months")){
//                System.out.println(" enter principle");
//                p = sc.nextFloat();
//                System.out.println(" enter time(Months)");
//                t = sc. nextFloat();
//                System.out.println(" enter rate  of interest");
//                r = sc.nextFloat();
//                si = (p*t*r)/(12*100);
//                System.out.println(" Simple interest is :" +si);
//                System.out.println(" Total Time :" +t+ "months");
//                System.out.println(" principle Amount :" +p);
//                System.out.println("Total Value :" +(p+si));
//            }
//
//            // this part for calculate interest rate of days
//
//            else if(time.equals("days")){
//                System.out.println(" enter principle");
//                p = sc.nextFloat();
//                System.out.println(" enter time(days)");
//                t = sc. nextFloat();
//                System.out.println(" enter rate  of interest");
//                r = sc.nextFloat();
//                si = (p*t*r)/(365*100);
//                System.out.println(" Simple interest is :" +si);
//                System.out.println(" Total Time :" +t+ "days");
//                System.out.println(" principle Amount :" +p);
//                System.out.println("Total Value :" +(p+si));
//            }
//            else {
//                System.out.println(" Please enter a valid or  correct time");
//            }
    }
}
