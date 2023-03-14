import java.util.Scanner;

public class tain_birth2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int e=sc.nextInt();
		int k=sc.nextInt();
		int count=0;
		while(e>0){
			int p=(int)e/k;
		if(p<0){
			p--;
		}
        e=p;
		count++;
		}
		System.out.println(count);
	}
}
