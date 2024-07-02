import java.util.Scanner;

public class numPowOf2 {

    public static boolean nPowOf2(int number){
        
        if((number & number-2) == 0){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Number : ");
        int number = sc.nextInt();

        boolean check = nPowOf2(number);
        if(check == true){
            System.out.println("Number is Power of 2");
        }else{
            System.out.println("Number is not Power of 2");
        } 
    }
}
