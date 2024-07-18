import java.util.Arrays;

public class longestSeq {
    public static int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        int longestSeq = 0;
        int j = 0;
        while ( j < nums.length) {
            count = 0;
            for(int i = 0; i < nums.length; i++){ 
                int x = nums[j];
                if(x == nums[i]+1){
                    x = x+1;
                    count++;
                }
            }
            // longestSeq = Math.max(longestSeq,count);            
            j++;
        }

        return count;
    }

    public static void main(String args[]){
        int nums[] = {0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestConsecutive(nums));
    }
}
