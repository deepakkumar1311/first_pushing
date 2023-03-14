import java.util.Scanner;

public class pattern_7a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int star=1;
        int space=0;
       
        while(row<=n){
            int i=1;
            while(i<=space){
            System.out.print("  ");
            i++;
            }
           row++;
           space++;
           System.out.println("*");
        }
    }
}
