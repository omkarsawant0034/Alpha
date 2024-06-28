// public class SelectionSort {

//     public static void selectionSort(int [] arr){

//         for(int i = 0; i < arr.length-1; i++){
//             int minPos = i;
//             for(int j = i+1; j < arr.length; j++){
//                 if(arr[minPos] > arr[j]){
//                     minPos = j;
//                 }            
//             }
            
//             int temp    = arr[minPos];
//             arr[minPos] = arr[i];
//             arr[i]      = temp;
//         }
        
//         for(int i : arr){
//             System.out.print(i+" ");
//         }
//     }
//     public static void main(String args[]){
//         int arr[] = {5,4,1,3,2};
//         selectionSort(arr);
//     }
// }

public class SelectionSort {

    public static int minElement(int [] arr,int i){
        
        int min_idx = i;
        for(int j = i+1; j < arr.length; j++){
            if(arr[min_idx] > arr[j]){
                min_idx = j;
            }
        }
        return min_idx;
    }

    public static void selectionSort(int [] arr){

        for(int i = 0; i < arr.length-1; i++){
            
            int min_idx = minElement(arr,i);
        
            int temp    = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i]      = temp;
        }
        
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
    public static void main(String args[]){
        int arr[] = {5,4,1,3,2};
        selectionSort(arr);
    }
}

