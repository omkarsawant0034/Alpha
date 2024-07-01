import java.util.Scanner;

public class fastExponential{

    public static int fastExpo(int a,int number){
        
        int ans = 1;
        while(number > 0){
            if((number & 1) != 0){
                ans = ans * a;
            }
            a = a*a;
            number = number>>1;
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println(fastExpo(3, 5));
        
    }
}
