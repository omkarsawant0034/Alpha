import java.util.*;

public class BinaryToDecimal {

    public static void binTodec(int binNum){
        
        int dec = 0;
        int pow = 0;

        while(binNum > 0){
            int lastdigit = binNum % 10;
            dec = dec + (lastdigit * (int)Math.pow(2,pow));
            pow++;
            binNum = binNum/10;
        }

        System.out.println(binNum+" "+"Binary to Decimal :"+" "+dec);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Binary number : ");
        int num = sc.nextInt();
        binTodec(num);
    }    
}
