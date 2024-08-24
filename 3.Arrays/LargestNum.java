public class LargestNum {

    public static int LargestNumber(int[] nums) {
        int largestNum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > largestNum) {
                largestNum = nums[i];
            }
        }
        return largestNum;
    }

    public static void main(String args[]) {
        int nums[] = { 2, 4, 6, 8, 19, 16 };
        System.out.println(LargestNumber(nums));
    }
}