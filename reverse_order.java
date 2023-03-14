import java.util.Scanner;

public class reverse_order {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int t=((int)(Math.log10(n)+1));
        for(int i=1;i<=t;i++){
            int r=n%10;
            sum=sum*10+r;
            n=n/10;
            System.out.println(r);
        }
    }
}
