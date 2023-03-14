import java.util.Scanner;

public class pattern13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=0;
        int star=row;
        
        while(row<n){
            int i=0;
            int value=1;
            while(i<=star){     
                System.out.print(value+" ");   
              int cvalue=(value*(row-i))/(i+1); 
              value=cvalue;
                i++;
            }
            row++;
            star++;
            System.out.println();
        }
    }
}
