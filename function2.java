import java.util.Scanner;

public class function2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter x:");
        int x=sc.nextInt();
        System.out.println("enter y:");
        int y=sc.nextInt();
        
        System.out.println("max value:"+getMax(x,y));
    }
    public static int getMax(int x,int y) {
        if(x>y){
            return x;
        }
        else{
            return y;
        }
    }
}
