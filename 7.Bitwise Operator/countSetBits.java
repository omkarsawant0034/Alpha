import java.util.Scanner;

public class countSetBits{

    public static int getseBits(int number){
        
        int count = 0;
        while(number > 0){
            if((number & 1) != 0){
                count++;
            }
            number = number>>1;
        }
        return count;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Number : ");
        int number = sc.nextInt();

        System.out.println("Number of set bits in "+number+" are : "+getseBits(number));
        
    }
}
