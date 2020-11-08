package Fault;
/*
* 给你一个二进制字符串数组 strs 和两个整数 m 和 n 。
请你找出并返回 strs 的最大子集的大小，该子集中 最多 有 m 个 0 和 n 个 1 。
如果 x 的所有元素也是 y 的元素，集合 x 是集合 y 的 子集 。
*/
public class findMaxForm {
    public int findMaxForm(String[] strs, int m, int n) {
        int[][] num=new int[strs.length][2];
        int[][] dp=new int[n+1][m+1];
        for(int i=0;i<strs.length;i++)
        {
            char[] chars=strs[i].toCharArray();
            for(int j=0;j<strs[i].length();j++)
            {
                if(chars[j]=='0')
                    num[i][0]++;
                if(chars[j]=='1')
                    num[i][1]++;
            }
            System.out.println(num[i][0]+"  "+num[i][1]);
        }
        for(int k=0;k<strs.length;k++)
        {
            for(int i=n;i>=num[k][1];i--)
       {
           for(int j=m;j>=num[k][0];j--)
           {

                    dp[i][j]=Math.max(dp[i-num[k][1]][j-num[k][0]]+1,dp[i][j]);
                    System.out.print(dp[i][j]);
           }System.out.println();
       }

        }
        return dp[n][m];
    }
}
