import java.util.Scanner;

public class PrimesInRange {

    public static boolean isPrime(int num){
        for(int i = 2; i <= Math.sqrt(num); i++){
            if((num % i) == 0){
                return false;
            }
        }
        return true;
    }

    public static void PrimesRange(int range){
        for(int i = 2; i <= range; i++){
            if(isPrime(i) == true){
                System.out.println(i+" ");
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range : ");
        int range = sc.nextInt();
        PrimesRange(range);
    }    
}
