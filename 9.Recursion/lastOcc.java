public class lastOcc {

    public static int LastOcc(int [] arr,int i,int key){
        if( i == arr.length-1) return -1;
        int isFound = LastOcc(arr, i+1, key);
        if(isFound == -1 && arr[i] == key) return i;
        return isFound;
    }
    public static void main(String args[]){
        int arr[] = {1,2,5,7,4,5,6};
        int key = 5;
        System.out.println(LastOcc(arr, 0, key));
    }
}
