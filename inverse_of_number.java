import java.util.Scanner;

public class inverse_of_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int power=1;
        int inverse=0;
        while(n>0){
            int q=n%10;
            inverse=inverse+power*((int)Math.pow(10, q-1));
            n=n/10;
            power++;
        }
    System.out.println(inverse);
  }
}
        
    

