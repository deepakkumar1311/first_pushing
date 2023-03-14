import java.util.Scanner;

public class sum_of_n_number {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number wherever you want to sum");
        int n=sc.nextInt();
        //int sum=sc.nextInt();
        int sum=0;
        
        if (n>=0) {
           
           sum=(n*(n+1))/2;
           System.out.println("the sum of the series="+sum);
            
        } else {
            System.out.println("error");
        }
        
    }
    
}
