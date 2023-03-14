import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {
        int x=0;
        int y=0;
        System.out.println("enter a move");
        Scanner sc= new Scanner(System.in);
        char move= sc.next().charAt(0);
        switch(move){
        case 'A':
        x++;
        System.out.println(x);
        break;
        case 'B':
        x--;
        System.out.println(x);
        break;
        case 'C':
        y--;
        System.out.println(y);
        break;
        case 'D':
        y++;
        System.out.println(y);
        break;
        default:
        System.out.println("invalid input");
        }
    }
    
}
