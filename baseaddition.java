import java.util.Scanner;

public class baseaddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int b = sc.nextInt();
        int t = getBaseAdditionValue(n1, n2, b);
        System.out.println(t);
    }

    public static int getBaseAdditionValue(int n1, int n2, int b) {
        int c = 0;
        int p = 1;
        int sum = 0;
        while (n1 > 0 || n2 > 0 || c > 0) {
            int r = n1 % 10;
            n1 = n1 / 10;
            int q = n2 % 10;
            n2 = n2 / 10;
            int d = r + q + c;
            c = d / b;
            d = d % b;
            sum = sum + d * p;
            p = p * 10;

        }
        return sum;
    }

}
