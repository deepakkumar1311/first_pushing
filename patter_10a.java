import java.util.Scanner;

public class patter_10a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int space1=n/2;
        int space2=0;
        
        while(row<=n){
             int i=1;
             while(i<=space1){
                System.out.print("  ");
                i++;
             }
             if(row>1 && row<5){
                System.out.print("*");
             }
             int j=1;
             while(j<=space2){
                System.out.print("  ");
                j++;
             }
             
             
             row++;
             if(row<=(n/2)+1){
                space1--;
                space2=space2+2;
             }
             else{
                space1++;
                space2=space2-2;
             }
             System.out.println("*");
        }
    }
}
