import java.util.Scanner;

class Search2dArray{

    public static void search(int arr[][],int key){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                if(arr[i][j] == key){
                    System.out.println("KEY IS FOUND ! at index of "+i+" "+j);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of rows and columns :");
        int m = sc.nextInt();
        int n = sc.nextInt();

        int arr[][] = new int[m][n];
        // Input 
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        // Output 
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        int key = 5;
        search(arr, key);
    }
}