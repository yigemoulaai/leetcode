package easy;

public class canJump {
    public boolean canJump(int[] nums) {
        boolean[] dp=new boolean[nums.length];
        dp[0]=true;
        for(int i=0;i<nums.length;i++)
        {
            if(nums.length<=nums[i]+i&&dp[nums.length-nums[i]])
                dp[i]=true;
        }
        return dp[nums.length-1];
    }
}
