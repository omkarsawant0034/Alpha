import java.util.Scanner;

public class SolidRhombus{

    public static void solid_rhombus(int n){
        
        for(int i = 1; i <= n; i++){
            
            //Space
            for(int j = 1; j <= n-i; j++){
                System.out.print("  ");
            }

            //Star
            for(int j = 1; j <= n ; j++){
                System.out.print("*"+" ");
            }
            
            System.out.println();
        }
    }
    
    public static void hollow_rhombus(int n){
        
        for(int i = 1; i <= n; i++){
            
            //Space
            for(int j = 1; j <= n-i; j++){
                System.out.print("  ");
            }

            //Star
            for(int j = 1; j <= n ; j++){
                if(i == 1 || i == n || j == 1 || j == n){
                    System.out.print("*"+" ");
                }else{
                    System.out.print("  ");
                }
            }
            
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Rows and Column : ");
        int n = sc.nextInt();
        //solid_rhombus(n);
        hollow_rhombus(n);

        sc.close();
    }    
}
