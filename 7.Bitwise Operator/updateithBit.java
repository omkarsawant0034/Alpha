import java.util.Scanner;

public class updateithBit {

    public static int  updateBit(int number,int i,int j){

        if( j != 0 && j != 1){
            return -1 ;
        }

        int mask = 1<<i;
        number = number ^ mask;
        return number | mask;
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Number : ");
        int number = sc.nextInt();
        System.out.println("Enter the Bit Number : ");
        int i = sc.nextInt();
        System.out.println("Enter the Bit to update with (0,1) : ");
        int j = sc.nextInt();
        
        System.out.println(updateBit(number, i, j));
    } 
}
