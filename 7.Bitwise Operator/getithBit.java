
// Check whether the given ith bit is ON(1) or OFF(0)

import java.util.Scanner;

public class getithBit {

    public static boolean getBit(int number,int i){

        int mask = 1<<i;

        if((number & mask) == 0){
            return false;
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Number : ");
        int number = sc.nextInt();
        System.out.println("Enter the Bit Number : ");
        int i = sc.nextInt();
        
        boolean check = getBit(number,i);
        if( check == true){
            System.out.println("Bit is 1 (ON)");
        }else{
            System.out.println("Bit is 0 (OFF)");
        }
    } 
}
