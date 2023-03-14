import java.util.Scanner;

public class pattern_17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int star=1;
        int space=2;
        while(row<=n){
            int i=1;
            while(i<=space){
                
                i++;
                if(row==(n/2)+1  ){
               
                    System.out.print("* ");
                
            }
                else{
                    System.out.print("  ");
                }
            }
             
            int j=1;
            while(j<=star){
                System.out.print("* ");
                j++;
            }
            row++;
            if(row<=(n/2)+1){
                star++;
            }
            
            
            else{
                star--;
            }
            System.out.println();
        }
       
}
}
