import java.util.Scanner;

public class pattern_19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int star=n;
        while(row<=n){
            int i=1;
            while(i<=star){ 
                if(row>1 && row<=n/2 && i<=n/2){
                System.out.print("  ");
                }          
               else if(row<=n/2 && i>(n/2)+1 && i<n){
                System.out.print("  ");
               }
               else if(row>(n/2)+1 && row<=n && i>1 && i<=n/2){
                System.out.print("  ");
               }
               else if(row>(n/2)+1 && row<=n-1 && i>(n/2)+1 && i<=n){
                System.out.print("  ");
               }
               else{
                System.out.print("* ");
               }
               
                i++;
            }
            row++;
            System.out.println();
        }
    }
}
