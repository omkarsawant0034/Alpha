// Print reverse number

import java.util.Scanner;

/**
 * reverseNum
 */
public class PrintReverseNum {

    public static int ReverseNumber(int num){
        
        while(num > 0){
            
            int digit = num % 10;
            System.out.print(digit);
            num = num / 10;
        }

        return num;
    }
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        ReverseNumber(num);
    }
}