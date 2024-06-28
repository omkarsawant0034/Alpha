
public class ReverseArray {
    
    public static int[] reverseArray(int[] nums){

        int i = 0;
        int j = nums.length-1;

        while(i < j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }

        return nums;
    }
    public static void main(String args[]){
        int nums[] = {1,2,3,4,5,6,7,8,9,10};
        reverseArray(nums);
        for(int i = 0; i < nums.length-1; i++){
            System.out.print(nums[i]+" ");
        }   
    }
}
