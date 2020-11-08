package easy;

/*
* 动态规划的中等题
* 每一次得到dp数组中最后一个元素保存的值不是最大，
* 最大值需要到书中去找  这是动态规划的思想？而且时间复杂度O(n^2)是可以优化的  优化也只能在查找大小上面优化
* 这就很难办（一直到现在  动态规划的思维还没建立起来  转化方程的建立是一大问题 ）
* */
public class lengthOfLIS {
    public int lengthOfLIS(int[] nums) {
        if(nums.length==0)
            return 0;
        if(nums.length==1)
            return 1;
        int[] dp=new int[nums.length];
        dp[0]=1;
        int kmax=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
            dp[i]=1;
        for(int i=0;i<nums.length-1;i++)
        {for(int j=i+1;j<nums.length;j++)
        {
            if(nums[j]>nums[i])
                dp[j]=Math.max(dp[i]+1,dp[j]);

        }
        kmax=Math.max(dp[i],kmax);
        }
        kmax=Math.max(dp[nums.length-1],kmax);
        return kmax;

    }
}
