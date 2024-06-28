
//PREFIX SUM 

public class PrefixSumMaxSubArraySum {
    
    public static void MaxSubArraySum(int [] nums){
        
        int prefixSum[] = new int[nums.length];
        int sum = 0;
        for(int i = 1; i <= nums.length; i++){
            sum += nums[i-1];
            prefixSum[i-1] = sum;
        }
        for(int i = 0; i < nums.length; i++){
            System.out.println(prefixSum[i]);
        }

        int MaxSum = Integer.MIN_VALUE;
        int CurrSubArraySum = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = i; j < nums.length; j++){
                CurrSubArraySum = i == 0 ? prefixSum[j] : prefixSum[j] - prefixSum[i-1];
            }
            if(MaxSum < CurrSubArraySum){
                MaxSum = CurrSubArraySum;
            }
        }

        System.out.println("Maximum SubArray Sum : "+MaxSum);
    }
    public static void main(String args[]){
        int nums[] = {2,4,6,8,10};
        MaxSubArraySum(nums);
    }
}
