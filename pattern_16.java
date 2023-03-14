import java.util.Scanner;

public class pattern_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star1 = row;
        int star2 = row;
        int space = 2 * n - 3;
        while (row <= n) {
            int value = 1;
            int i = 1;
            while (i <= star1) {
                System.out.print(value + " ");
                i++;
                value++;
            }
            if (row == n) {
                star2--;
                
            }
            int k = 1;
            while (k <= space) {
                System.out.print("  ");
                k++;
            }
            int cvalue = row;
            int j = 1;
            while (j <= star2) {
                if(row==n &&j==1){                 
                    cvalue--;
                }
                System.out.print(cvalue + " ");
                j++;        
                cvalue--;
            }
            row++;
            star1++;
            star2++;
            space = space - 2;
            System.out.println();
        }
    }

}
