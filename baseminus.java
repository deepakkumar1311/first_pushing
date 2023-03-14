import java.util.Scanner;

public class baseminus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n2 = sc.nextInt();
        int n1 = sc.nextInt();
        int b = sc.nextInt();
        int sub=getSubValue(n2,n1,b);
        System.out.println(sub);
    }

    public static int getSubValue(int n2, int n1, int b) {
        int sum = 0;
        int p = 1;
        int c = 0;
        while (n2 > 0) {
            int d1 = n1 % 10;
            n1 = n1 / 10;
            int d2 = n2 % 10;
            n2 = n2 / 10;

            int d = 0;
            d2 = d2 + c;
            if (d2 >= d1) {
                c = 0;
                d = d2 - d1;
            } else {
                c = -1;
                d = d2 + b - d1;
            }
            sum = sum + d * p;
            p = p * 10;

        }
        return sum;
    }

}
