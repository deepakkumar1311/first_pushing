import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      System.out.println("enter the number\n");
      int x=sc.nextInt();
        if(x%2==0){
            System.out.println("the number is even");
        }
        else{
            System.out.println("the number is odd");
        }
    }
    
}
