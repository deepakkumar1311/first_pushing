import java.util.Scanner;

public class code_chef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number d:");
        int d = sc.nextInt();
        System.out.println("enter A:");
        int A = sc.nextInt();
        System.out.println("Enter B:");
        int B = sc.nextInt();

        if (((B - A) % 2 == 0) || ((A - B) % 2 == 0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
