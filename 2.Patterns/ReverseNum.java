// Print reverse number

import java.util.Scanner;

/**
 * reverseNum
 */
public class ReverseNum {

    public static int ReverseNumber(int num){
        
        int reverse = 0;
        while(num > 0){
            
            int digit = num % 10;
            reverse = (reverse *10) + digit;
            num = num / 10;
        }

        return reverse;
    }
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        System.out.println("Reverse Number is :"+ReverseNumber(num));
    }
}