import java.util.Scanner;

public class positive_negative {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter any number\n");
        int x=sc.nextInt();
        if (x>0 && x%2==0){
            System.out.println("positive even no.");}
            else if(x>0 && x%2!=0){
                System.out.println("positive odd no.");
            }
            else if(x<0 && x%2==0){
                System.out.println("negative positive no.");
            }
            else{
                System.out.println("negative odd no.");
            }
        
    }
    
}
