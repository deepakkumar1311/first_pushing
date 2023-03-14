import java.util.Scanner;

public class add2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int star=2*n-1;
        int space=0;
        while(row<=n){
            int j=1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }
            int i=1;
            while(i<=star){
                System.out.print(i+" ");
                i++;
            }
           
            row++;
            star=star-2;
            space++;
            System.out.println(); 
    } 
    }
    
}
