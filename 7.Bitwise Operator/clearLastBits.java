import java.util.Scanner;

public class clearLastBits {

    public static int  clearlastBits(int number,int i){
        
        int mask = -1<<i;
        return number & mask;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Number : ");
        int number = sc.nextInt();
        System.out.println("Enter the number of last bits to clear : ");
        int i = sc.nextInt();
        
        System.out.println(clearlastBits(number, i));
    } 
}
