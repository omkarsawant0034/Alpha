import java.util.Scanner;

public class NumberPyramid{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Rows and Column : ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            
            //Space
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }

            //Number
            for(int j = 1; j <= i; j++){
                System.out.print(i+" ");
            }

            System.out.println();
        }

        sc.close();
    }    
}
