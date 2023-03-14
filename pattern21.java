import java.util.Scanner;

public class pattern21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int star=row;
        int space=n*3-1;
        int space_star=row;
        while(row<=n){
            int i=1;
            while (i<=star) {
                System.out.print("* ");
                i++;
                
            }
            int k=1;
            while (k<=space) {
                System.out.print(" ");
                k++;}
            int j=1;
             if(row==n){
                    j=2;
                }
            while (j<=space_star) {
               
                System.out.print("* ");
                j++;
                // if(j==5){
                //     for(int t=1;t<5;t++){
                //         System.out.print(" ");
                //     }
                //     break;
                // }
              
            }

            row++;
            star++;
            space_star++;
            space=space-4;
            System.out.println();
        
    }
}
}