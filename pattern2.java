import java.util.*;
class pattern2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // n=5
        int row = 1;
        int star=row;
        while(row<=n){
            int i=1;
            while(i<=star){
                System.out.print("* ");
                i++;
                
            }
            System.out.println();
            row++;
            star++;
            
        }
    }
}
 