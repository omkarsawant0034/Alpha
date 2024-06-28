import java.util.Scanner;

public class decimalTobinary {

    public static void decTobin(int DecNum){
        int bin = 0;
        int pow = 0;
        while(DecNum > 0){
            int remainder = DecNum % 2; 
            bin = bin + (remainder*(int)Math.pow(10,pow));
            pow++;
            DecNum = DecNum/2;
        }
        System.out.println("Decimal "+DecNum+" to Binary : "+bin);
    } 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Decimal Number : ");
        int DecNum = sc.nextInt();
        decTobin(DecNum);
        sc.close();
    }    
}
