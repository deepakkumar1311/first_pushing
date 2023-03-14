import java.util.Scanner;

public class grade_of_student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks : ");
        int n = sc.nextInt();
        if (n > 90) {
            System.out.println("Excellent");
        } else if (n > 80) {
            System.out.println("Good");
        } else if (n > 70) {
            System.out.println("Fair");
        } else if (n > 60) {
            System.out.println("Meets Expectation");
        } else {
            System.out.println("Below Bar");
        }
    }
}
