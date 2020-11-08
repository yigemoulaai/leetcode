package easy;

public class kechongfuPackage {
    public int maxTurbulenceSize(int[] A,int k) {
            int[][] dp=new int[k+1][A.length+1];
            //i为背包容量
            //j为可以装配的物品的数量
            for(int i=1;i<=k;i++)
            {
                for(int j=1;j<=A.length;j++)
                {
                    if(i==1)
                        dp[i][j]=A[0];
                    else {
                        if(i>=j)
                        {
                            dp[i][j]=Math.max(dp[i-1][j]+A[0],dp[i-j][j]+A[j-1]);
                            dp[i][j]=Math.max(dp[i][j],dp[i][j-1]);
                        }
                        else dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                    }
                   // System.out.print("  "+dp[i][j]);
                }
            }
            return dp[k][A.length];
    }
}
