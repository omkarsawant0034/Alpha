public class BinarySearch {
    
    public static int binarySearch(int[] nums,int key){

        int left = 0;
        int right = nums.length-1;

        while(left <= right){
            
            int mid = (left + right) /2;

            if(nums[mid] == key){
                return mid;
            }

            if(nums[mid] > key){        // left
                right = mid-1;
            }else if(mid < key){        //right 
                left = mid+1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int nums[] = { 2,3,4,6,8,9,12,13,17};
        int key = 9;
        System.out.println(binarySearch(nums,key));
    }    
}
