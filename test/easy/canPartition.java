package easy;

import java.lang.annotation.ElementType;

public class canPartition {
    public boolean canPartition(int[] nums) {
        int sum=0;
        int k=0;
        if(nums.length<2)
            return false;
            if(nums.length==1&&nums[0]==nums[1])
                return true;
            else {
                for(int i=0;i<nums.length;i++)
                {
                    sum+=nums[i];
                }
                if(sum%2!=0)
                    return false;
                for(int i=0;i<nums.length;i++)
                {
                    if(nums[i]>sum/2)
                        return false;
                }
                boolean[][] dp=new boolean[nums.length][sum/2+1];
                for(int i=0;i<nums.length;i++)
                {
                    dp[i][0]=false;
                    for(int j=1;j<=sum/2;j++)
                    {
                        if(i==0)
                        {
                            if(j==nums[i])
                                dp[i][j]=true;
                            else
                                dp[i][j]=false;
                        }
                        else {
                            if(j==nums[i])
                                dp[i][j]=true;
                            else
                            {
                                if(j>=nums[i])
                                dp[i][j]=dp[i-1][j-nums[i]];
                                if(!dp[i][j]) dp[i][j]=dp[i-1][j];
                            }
                        }
                        System.out.println(dp[i][j]);
                    }
                }


            return dp[nums.length-1][sum/2];
            }

    }




}
