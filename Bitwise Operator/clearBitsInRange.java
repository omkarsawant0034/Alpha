import java.util.Scanner;

public class clearBitsInRange {

    public static int  clearbitsInRange(int number,int i,int j){
        
        int a = -1 << (j+1);
        int b = (1 << i)-1;
        int mask = a | b;
        return number & mask;
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Number : ");
        int number = sc.nextInt();
        System.out.println("Enter the ith Position : ");
        int i = sc.nextInt();
        System.out.println("Enter the jth Position : ");
        int j = sc.nextInt();
        
        System.out.println(clearbitsInRange(number, i, j));
    } 
}
