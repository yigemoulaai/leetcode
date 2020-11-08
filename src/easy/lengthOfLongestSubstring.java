package easy;


import java.util.ArrayList;
import java.util.List;

public class lengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int k=0;
        int[][] dp=new int[s.length()][s.length()];
        int[] count=new int[s.length()];
        if(s.length()==1||s.length()==0)
        {
            return s.length();
        }

        else {
            for(int i=0;i<s.length();i++)
                for(int j=0;j<s.length();j++)
                {
                    if(i==0) dp[i][j]=1;
                    if(j==0) dp[i][j]=1;
                }
            for(int i=1;i<s.length();i++)
                for(int j=1;j<s.length();j++)
                {

                    if(s.substring(0,j).indexOf(s.charAt(j))!=-1)
                    {
                        if(dp[i][j-1]==Math.max(dp[i-1][j],dp[i][j-1]))
                        {
                            dp[i][j-1]=Math.max(dp[i-1][j],dp[i][j-1]);
                            if(s.substring(0,j).indexOf(s.charAt(j))==j-1)
                                k++;
                        }
                    }

                    else dp[i][j]=dp[i-1][j-1]+1;
                    //System.out.println(dp[i][j]);
                }
        }

        return dp[s.length()-1][s.length()-1]-k;
    }
    }



