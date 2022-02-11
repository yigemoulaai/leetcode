package easy;

import java.util.Arrays;

public class minimumDifference {
    public int minimumDifference(int[] nums, int k) {
        int min =Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i =0 ;i < nums.length - k; i++){
            min = Integer.min(nums[i + k] - nums[i], min);
        }
        return min;
    }
}
