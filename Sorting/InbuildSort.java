import java.util.Arrays;

public class InbuildSort {
    public static void main(String[] args) {
        int arr[] = {2,3,1,5,4};
        
        Arrays.sort(arr); // O(2logn)
        
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }    
}
