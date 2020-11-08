package easy;

public class isLongPressedName {
    public boolean isLongPressedName(String name, String typed) {
            boolean[][] dp=new boolean[name.length()+1][typed.length()+1];
            char[] s1=name.toCharArray();
            char[] s2=typed.toCharArray();
            dp[0][0]=true;
            for(int i=0;i<name.length();i++)
                for(int j=0;j<typed.length();j++)
                {
                    if(s1[i]==s2[j])
                    {
                        if(dp[i-1][j-1])
                            dp[i][j]=dp[i-1][j-1];
                        if(dp[i][j-1])
                            dp[i][j]=dp[i][j-1];
                    }
                }
                return dp[name.length()][typed.length()];
    }
}
