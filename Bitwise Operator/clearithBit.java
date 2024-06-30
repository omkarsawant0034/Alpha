import java.util.Scanner;

public class clearithBit {

    public static int  clearBit(int number,int i){

        int mask = 1<<i;
        number = number ^ mask;
        /*
        
        mask = ~(1<<i);
        number = number & mask;
        
        */
        return number;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Number : ");
        int number = sc.nextInt();
        System.out.println("Enter the Bit Number : ");
        int i = sc.nextInt();
        
        System.out.println(clearBit(number, i));
    } 
}
