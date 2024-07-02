// If if a number is Odd or Even

import java.util.Scanner;

public class OddEven {

    public static boolean checkOddEven(int number){

        int mask = 1;
        if((number&mask) == 0 ){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Number : ");
        int number = sc.nextInt();
        
        boolean check = checkOddEven(number);
        if( check == true){
            System.out.println("Number is Even");
        }else{
            System.out.println("Number is Odd");
        }
    } 
}
