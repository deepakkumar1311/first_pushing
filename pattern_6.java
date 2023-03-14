import java.util.Scanner;

public class pattern_6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int star=(n/2)+1;
        int spstar=(n/2)+1;
        int space=0;
        while(row<=n){
            int i=1;
            while(i<=star){
                System.out.print("* ");
                i++;
            }
            int k=1;
            while(k<=space){
                System.out.print("  ");
                k++;
            }
            int j=1;
            while(j<=spstar){
                System.out.print(" *");
                j++;
            }
            row++;
         
            if(row<=(n/2)+1){
                star=star-1;
                space=space+2;
                spstar=spstar-1;
            }
            else{
                star=star+1;
                space=space-2;
                spstar=spstar+1;
            }
           
            System.out.println();
        }
    }
}
