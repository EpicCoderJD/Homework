public class Pattern9 {
    public static void main(String[]args){
        int n=5;
        for(int i=1;i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int k=i; k>=1; k--){
                System.out.print(k);
            }
            for(int h=1; h<=i; h++){
                System.out.print(h);
            }
            System.out.println();
        }
    }
}
