import java.util.Scanner;

public class rotation_of_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int temp = n;

        int sum = 0;
        int count = 0;

        while (temp > 0) {

            temp = temp / 10;
            count++;
        }
        if(k>0){
            k=k%count;
        }
        else if(k<0){
            k=(k%count)+count;
        }
        

        int t = ((int) Math.pow(10, k));
        int z = ((int) Math.pow(10, (count - k)));

        int r = n % t;
        int q = n / t;
        sum = ((r * z) + q);
        System.out.println(sum);
       
    }
}
