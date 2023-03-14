import java.util.Scanner;

public class pattern_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = 1;
        int space = n / 2;
        int value = 0;
        while (row <= n) {
            int i = 1;
            while (i <= space) {
                System.out.print("  ");
                i++;
            }
            int cvalue=value;
            int j = 1;
            while (j <= star ) {
                if (j<=(star/2)+1 ) {
                    cvalue++;
                   
                } else {
                    cvalue--;
                }
                System.out.print(cvalue + " ");
                j++;
            }

            row++;
            if (row <= (n / 2) + 1) {
                space--;
                star = star + 2;
                value++;
                
                
            } else {
                space++;
                star = star - 2;
                value--;
                
            }
            System.out.println();
        }
    }

}