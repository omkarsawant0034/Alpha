import java.util.Scanner;

public class PalindromicNumPattern{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Rows and Column : ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            
            //Space
            for(int j = 1; j <= n-i; j++){
                System.out.print("   ");
            }

            //desc
            for(int j = i; j >= 1; j--){
                System.out.print(j+"  ");
            }

            //asc
            for(int j = 2; j <= i; j++){
                System.out.print(j+"  ");
            }

            System.out.println();
        }

        sc.close();
    }    
}
