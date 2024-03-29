package arraypairsum;

import java.util.Arrays;

public class ArrayPairSum {
    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length - 1; i += 2) {
            sum = sum + nums[i];
        }
        return sum;
    }
}
