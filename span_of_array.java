import java.util.Scanner;

public class span_of_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];;
        for(int j=0;j<arr.length;j++){
             arr[j]=sc.nextInt();
        }
        int max=arr[0];
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
         
        }
        System.out.println(max-min);
    }
}
