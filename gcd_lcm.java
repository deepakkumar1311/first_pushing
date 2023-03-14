import java.util.Scanner;

public class gcd_lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int temp1 = n1;
        int temp2 = n2;

        while (n1 % n2 != 0) {

            int rem = n1 % n2;
            n1 = n2;
            n2 = rem;

        }
        int gcd = n2;
        int lcm = (temp1 * temp2) / gcd;
        System.out.println("GCD of n1 and n2: " + gcd);
        System.out.println("LCM of n1 and n2: " + lcm);

    }
}
