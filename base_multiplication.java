import java.util.Scanner;

public class base_multiplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int b=sc.nextInt();
        int a1=getDecimalValue(n1,b);
        int a2=getDecimalValue(n2,b);
        int product=getValueInBase(a1*a2,b);
        System.out.println(product);
    }
    public static int getValueInBase(int n,int b) {
           
        int count=0;
        int sum=0;
        while(n>0){
                int rem=n%b;
                n=n/b;
                count++;
                sum=sum+rem*((int)Math.pow(10, count-1));
            
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
