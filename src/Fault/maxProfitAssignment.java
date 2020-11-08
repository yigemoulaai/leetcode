package Fault;

public class maxProfitAssignment {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int max=-1;
        for(int i=0;i<worker.length;i++)
        {
            if(max<worker[i])
                max=worker[i];
        }
        int[] dp=new int[max+1];
        for(int i=0;i<difficulty.length;i++)
        {
            for(int j=1;j<=max;j++)
            {
                if(j>=difficulty[i])
                {
                    dp[j]=Math.max(profit[i],dp[j]);
                    //dp[i]=Math.max(dp[i],dp[i-1]);
                }

                //else dp[i]=dp[i-1];

                System.out.println(dp[j]);
        }

    }
        max=0;
            for(int i=0;i<worker.length;i++)
                max+=dp[worker[i]];
            return max;
    }
}
