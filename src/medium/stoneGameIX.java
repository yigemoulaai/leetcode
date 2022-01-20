package medium;

/**
 * @Author ACER
 * @Date:2022/1/20
 */
public class stoneGameIX {
    public boolean stoneGameIX(int[] stones) {
        int[] nums =new int[3];
        for(int i =0 ;i < stones.length ;i++)
        {
            stones[i] =stones[i] %3;
            nums[stones[i]]++;
        }
        if (nums[0] % 2 == 0) {
            return nums[1] >= 1 && nums[2] >= 1;
        }
        return nums[1] - nums[2] > 2 || nums[2] - nums[1] > 2;


        return false;
    }
}
