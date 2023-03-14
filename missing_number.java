import java.util.Scanner;

public class missing_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int sum1=0;
        int sum2=0;
        for (int j = 1; j < n;j++) {
            
            int k=sc.nextInt();
            sum1=sum1+k;
        }
       // System.out.println(sum1);
        for(int i=1;i<=n;i++){
           sum2=sum2+i;
        }
        System.out.println("missing number: "+(sum2-sum1));
    
    }
}
