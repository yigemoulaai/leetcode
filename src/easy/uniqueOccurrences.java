package easy;

import java.util.List;

public class uniqueOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        boolean[] dp=new boolean[arr.length+1];
        int[] nums=new int[arr.length+1];
        int k=0;
        for(int i=0;i<arr.length-1;i++)
        {
            if(dp[i]==false)
            {
                k++;
                dp[i]=true;
                nums[k]=1;
            }
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j]&&dp[j]==false)
                {
                    nums[k]++;
                    dp[j]=true;
                }
            }
        }
        if(dp[arr.length-1]==false) nums[++k]=1;
        for(int i=0;i<k-1;i++)
            for(int j=i+1;j<k;j++)
            {
                if(nums[i+1]==nums[j+1])
                    return  false;
            }
        return true;
    }
}
