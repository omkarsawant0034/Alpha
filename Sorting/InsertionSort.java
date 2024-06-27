/*
public class InsertionSort {

    public static int[] insertionSort(int [] arr){
        
        for(int i = 1; i < arr.length; i++){
            int temp = arr[i];
            int j = 0;
            for(j = i-1; j >= 0; j--){
                if(arr[j] > temp){
                    arr[j+1] = arr[j];
                }else{   // if arr[j] <= temp;
                    break;
                }
            }
            arr[j+1] = temp;
        }
        return arr;
    }
    public static void main(String args[]){
        int arr[] = {5,4,1,3,2};
        insertionSort(arr);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
*/


public class InsertionSort {

    public static int[] insertionSort(int [] arr){
        
        for(int i = 1; i < arr.length; i++){
        
            int curr = arr[i];
            int prev = i-1; 
        while( prev >= 0 && arr[prev] > curr){
            arr[prev+1] = arr[prev];
            prev--; 
        }
        arr[prev+1] = curr;
    }

    return arr;
}
    public static void main(String args[]){
        int arr[] = {5,4,1,3,2};
        insertionSort(arr);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
