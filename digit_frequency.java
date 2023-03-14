import java.util.Scanner;

public class digit_frequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=sc.nextInt();
        int f=getDigitFrequency(n,t);
        System.out.println(f);
    }
        public static int getDigitFrequency(int n, int t) {
        int count=0;
        while(n>0){
           int r=(int)n%10;
           n=n/10;
          if(r==t){
            count++;
          }
        }
        return count;
        }
        
        
    }

