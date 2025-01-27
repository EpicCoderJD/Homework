public class HollowButterfly {
    public static void main(String[] args) {
        int n=5;
        for(int i=n; i>=1;i--){
            for(int j=1; j<=n-i; j++){
                if(j==1||j==n-i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int k=1; k<=2*i-1; k++){

                System.out.print(" ");
            }
            for(int j=1; j<=n-i; j++){
                if(j==1||j==n-i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i=1; i<=n;i++){
            for(int j=1; j<=n-i; j++){
                if(j==1||j==n-i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int k=1; k<=2*i-1; k++){

                System.out.print(" ");
            }
            for(int j=1; j<=n-i; j++){
                if(j==1||j==n-i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
