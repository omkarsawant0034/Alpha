// import java.util.Scanner;

// public class InvertedAndRotatedHalfPyr {
//     public static void main(String args[]){
        
//         Scanner sc = new Scanner(System.in);
        
//         System.out.println("Enter Rows and Column : ");
//         int row = sc.nextInt();
//         int column = sc.nextInt();

//         for(int i = row; i >= 1; i--){
//             for(int j = 1; j <= column; j++){
//                 if(j == column || i == 1 || i <= j){
//                     System.out.print("*"+" ");
//                 }else{
//                     System.out.print("  ");
//                 }
//             }
//             System.out.println();
//         }

//         sc.close();
//     }
// }

import java.util.Scanner;

public class InvertedAndRotatedHalfPyr {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Rows and Column : ");
        int row = sc.nextInt();
        //int column = sc.nextInt();

        for(int i = 1; i <= row; i++){
            //spaces
            for(int j = 1; j <= row-i; j++){
                System.out.print("  ");
            }
            //stars
            for(int j = 1; j <= i; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}
