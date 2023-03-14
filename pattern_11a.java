import java.util.Scanner;

public class pattern_11a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int star=row;
        int value=1;
        while(row<=n){
            int i=1;
            while(i<=star){
              System.out.print(value+" ");
              i++;
              value++;
            }
         row++;
         star++;
        
         System.out.println();
        }
    }
}
