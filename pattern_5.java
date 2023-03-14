import java.util.Scanner;

public class pattern_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = (2 * row) - 1;
        int space = n - 1;
        while (row <= n) {
            int i = 1;
            while (i <= space) {
                System.out.print("  ");
                i++;
            }
            int j = 1;
            while (j <= star) {
                System.out.print("* ");
                j++;
            }
            row++;
            if(row<=(n/2)+1){
                star=star+2;
                space--;
            }
            else{
                star=star-2;
                space++;
            }
            System.out.println();
    }
}
}
