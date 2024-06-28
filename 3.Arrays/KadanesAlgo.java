
public class KadanesAlgo {

    public static void Kadane(int nums[]){
        
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            currSum += nums[i];
            System.out.println(currSum);
            if(currSum < 0){
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println("Maximum sum of SubArray is : "+maxSum);
    }
    public static void main(String args[]){
        int nums[] = {-2,-3,4,-1,-2,1,5,-3};
        Kadane(nums);
    }    
}
