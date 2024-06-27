import java.util.Scanner;

public class DiamontPattern{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Rows and Column : ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            
            //Space
            for(int j = 1; j <= n-i; j++){
                System.out.print("  ");
            }

            //Star
            for(int j = 1; j <= (2*i)-1; j++){
                System.out.print("*"+" ");
            }
            
            System.out.println();
        }
        
        for(int i = n; i > 0; i--){
            
            //Space
            for(int j = 1; j <= n-i; j++){
                System.out.print("  ");
            }

            //Star
            for(int j = 1; j <= (2*i)-1 ; j++){
                System.out.print("*"+" ");
            }
            
            System.out.println();
        }
        
        sc.close();
    }    
}
