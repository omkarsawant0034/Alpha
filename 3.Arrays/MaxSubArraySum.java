
// BRUTE FORCE 

public class MaxSubArraySum {

    public static void subArray(int [] nums){
        int CurrSubArraySum = 0; 
        int MaxSubArraySum = Integer.MIN_VALUE; 
        for(int i = 0; i < nums.length; i++){
            int start = i;
            for(int j = i; j <nums.length; j++){
                int end = j;
                CurrSubArraySum = 0;
                for(int k = start; k <= end; k++){
                    CurrSubArraySum += nums[k];
                }
                
                System.out.println(CurrSubArraySum);

                if(CurrSubArraySum > MaxSubArraySum){
                    MaxSubArraySum = CurrSubArraySum;
                }
            }
        }
        System.out.println("Max SubArray Sum : "+MaxSubArraySum);
    }
    public static void main(String args[]){
        int nums[] = {1,-2,6,-1,3};
        subArray(nums);
    }
}
