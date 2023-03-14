import java.util.Scanner;

public class array_element {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int [n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int t=sc.nextInt();
        int index=-1;
        for(int j=0;j<arr.length;j++){
            if(arr[j]==t){
               index=j;
                break;
            }
          
        }
        System.out.println(index);
    }
}
