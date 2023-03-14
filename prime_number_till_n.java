import java.util.Scanner;

public class prime_number_till_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int low = sc.nextInt();
        System.out.println("Enter number: ");
        int high = sc.nextInt();

        while (low < high) {

            Boolean flag = false;
            for (int i = 2; i < low; i++) {
                if (low % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (flag == false && low > 1)
                System.out.print(low + " ");

            low++;

        }

    }
}
