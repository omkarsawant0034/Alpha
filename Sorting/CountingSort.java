public class CountingSort {

    public static void countSort(int [] arr){
        
        int largest = 0;
        for(int i = 0; i < arr.length; i++){
            largest = Math.max(largest,arr[i]);
        }

        int count[] = new int[largest+1];

        for(int i = 0; i < arr.length; i++){
            count[arr[i]]++;
        }

        int j = 0;
        for(int i = 0; i < count.length;i++){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,4,1,3,2,4,3,7};
        countSort(arr);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
