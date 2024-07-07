public class firstOcc {

    public static int FirstOcc(int [] arr,int i,int key){
        if( i == arr.length-1) return 0;
        if(arr[i] == key) return i;
        return FirstOcc(arr, i+1, key);
    }
    public static void main(String args[]){
        int arr[] = {1,2,7,4,5,6};
        int key = 9;
        System.out.println(FirstOcc(arr, 0, key));
    }
}
