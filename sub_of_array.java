import java.util.Scanner;

public class sub_of_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int [] arr1=new int[n1];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();
        }
        int n2=sc.nextInt();
        int [] arr2=new int[n2];
        for(int j=0;j<arr2.length;j++){
            arr2[j]=sc.nextInt();
        }
        int [] sub=new int [n1];
        int i=arr1.length-1;
        int j=arr2.length-1;
        int k=sub.length-1;
        int c=0;
       while(k>=0){
        int d=0;
        int arr2v=j>=0?arr2[j]:0;
        if(arr1[i]+c>=arr2v){
          d=arr1[i]+c-arr2v;
          c=0;
        }
        else{
            d=arr1[i]+c+10-arr2v;
            c=-1;
        }
        sub[k]=d;
        i--;
        j--;
        k--;
      
       }
        int idx = 0;
    while (idx < sub.length && sub[idx] == 0) {
      idx++;
    }
    while (idx < sub.length) {
      System.out.println(sub[idx]);
     idx++;
    }
      
    }
}
