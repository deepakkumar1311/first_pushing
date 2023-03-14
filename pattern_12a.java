import java.util.Scanner;

public class pattern_12a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 2;
        int star = row;
        int n1 = 0;
        int n2 = 1;
        System.out.println("0");
        while (row <= n) {
            int i = 1;

            while (i <= star) {
                 int n3=n1+n2;
                System.out.print((n3) + " ");
                n2 = n1;
                n1 = n3;
                i++;
            }
            row++;
           star++;
            System.out.println();

        }
    }
}