// Prime numbervor not 

import java.util.Scanner;

/**
 * reverseNum
 */
public class PrimeNumber {

    public static boolean PrimeNum(int num){
        int i = 2;
        while((Math.sqrt(num)) > i){
            if((num % i) == 0){
                return false;
            }
            i++;
        }
        return true;
    }
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        System.out.println(PrimeNum(num));
    }
}