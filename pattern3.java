import java.util.Scanner;

public class pattern3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int row=1;
        int star=5-row+1;
        while(row<=n){
            int i=1;
            while(i<=star){
                System.out.print("* ");
              i++;
            }
            System.out.println();
            row++;
            star--;
            

        }
    }
    
}
