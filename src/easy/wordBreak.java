package easy;

import java.util.List;

public class wordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        int length=s.length();
        boolean[] dp=new boolean[length+1];
        dp[0]=true;
        for(int i=0;i<length;i++)
            for(int j=0;j<wordDict.size();j++)
            {
                int jlen=wordDict.get(j).length();
                if(i+1>=jlen)
                {
                    String s1=s.substring(i-jlen+1,i+1);
                    String s2=wordDict.get(j);
                    if(s1.equals(s2)==true)
                    {
                        if(dp[i-jlen+1]==true)
                            dp[i+1]=true;
                    }
                }

            }
        return dp[length];
    }
}
