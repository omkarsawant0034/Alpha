import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FourSum {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        Set<List<Integer>> resultSet = new HashSet<>();

        for (int i = 0; i < nums.length - 3; i++) {
            for (int j = i + 1; j < nums.length - 2; j++) {
                int left = j + 1;
                int right = nums.length - 1;
                while (left < right) {
                    List<Integer> arr = new ArrayList<>();
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];

                    if (sum == target) {
                        arr.add(nums[i]);
                        arr.add(nums[j]);
                        arr.add(nums[left]);
                        arr.add(nums[right]);

                        if (!resultSet.contains(arr)) {
                            resultSet.add(arr);
                        }
                        left++;
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        result.addAll(resultSet);
        return result;
    }

    public static void main(String args[]) {
        // int[] nums = { 1, 0, -1, 0, -2, 2 };
        int[] nums = { 2, 2, 2, 2, 2, 2 };
        int target = 8;
        System.out.println(fourSum(nums, target));
    }
}
