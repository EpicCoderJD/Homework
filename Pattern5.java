public class Pattern5 {
    public static void main(String[]args){
        int n=5;

        // first part of printing star
        for(int i =1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            // part of space printing
            int space=2*(n-i);
                for(int k=1; k<=space; k++){
                    System.out.print(" ");
                }

                // part of second star  printing
                for(int h=1; h<=i; h++){
                    System.out.print("*");
                }

            System.out.println();
        }
        // lower side printing
        // first part of program
        for(int i =n; i>0; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            // space printing part
            int space=2*(n-i);
            for(int k=1; k<=space; k++){
                System.out.print(" ");
            }
            // part of second star printing
            for(int h=1; h<=i; h++){
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
