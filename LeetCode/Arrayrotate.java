class Arrayrotate{
    
    public static int kadanesMin(int nums[]){
        int currSum = 0;
        int minSum = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            currSum = Math.min(currSum+nums[i],nums[i]);
            minSum = Math.min(minSum,currSum);
        }
        return minSum;
    }
    
    public static int kadanesMax(int nums[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            currSum = Math.max(currSum+nums[i],nums[i]);
            maxSum = Math.max(maxSum,currSum);
        }
        return maxSum;
    }

    public static int maxSubarraySumCircular(int[] nums) {
        //1
        int totalSum = 0;
        for(int i : nums){
            totalSum += i;
        }

        //2
        int minSum = kadanesMin(nums);

        //3
        int maxSum = kadanesMax(nums);

        //4
        int cirSum = totalSum - minSum;

        //5
        if(maxSum > 0) return Math.max(maxSum, cirSum);
        //6
        return maxSum;
    }
    public static void main(String[] args) {
        int []arr = {5,-3,5};
        System.out.println(maxSubarraySumCircular(arr));
       
    }
}