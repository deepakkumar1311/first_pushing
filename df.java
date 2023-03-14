import java.util.Scanner;

public class df {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=sc.nextInt();
        int f=getDigitFrequency(n,p);
        System.out.println(f);
    }
        
        public static int getDigitFrequency (int n,int p){
        int count =0;
        while(n>0){
            int r=n%10;
            if(r==p){
                count++;
            }
            n=n/10;
        }
    
        return count;
    
    }
}
