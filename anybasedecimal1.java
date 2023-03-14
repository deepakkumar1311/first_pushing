import java.util.Scanner;

public class anybasedecimal1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
    }

    public static int getValueInBase(int n, int b1, int b2) {
        int dec = getDecimalValue(n, b1);
        int dn = getValueInBase(dec, b2);
        return dn;
    }

    public static int getValueInBase(int n, int b) {

        int count = 0;
        int sum = 0;
        while (n > 0) {
            int rem = n % b;
            n = n / b;
            count++;
            sum = sum + rem * ((int) Math.pow(10, count - 1));
        }
        return sum;
    }

    public static int getDecimalValue(int n, int b) {
        int sum = 0;
        int p = 1;
        while (n > 0) {
            int r = n % 10;
            n = n / 10;
            sum = sum + r * p;
            p = p * b;
        }
        return sum;
    }

}
