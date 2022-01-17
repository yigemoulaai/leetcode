package hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author ACER
 * @Date:2022/1/17
 */
public class countVowelPermutation {
    public int countVowelPermutation(int n) {
        long[][] dp =new long[n][5];
        for(int i =0 ; i< 5 ;i++){
            dp[0][i] =1;
        }
        for(int i=1 ; i < n ;i++)
        {
            dp[i][0]+= dp[i-1][1] %((int)Math.pow(10,9)+7); //+dp[i-1][2]+dp[i-1][4]
            dp[i][0]+= dp[i-1][2] %((int)Math.pow(10,9)+7); //+dp[i-1][2]+dp[i-1][4]
            dp[i][0]+= dp[i-1][4] %((int)Math.pow(10,9)+7); //+dp[i-1][2]+dp[i-1][4]
            dp[i][1]+= dp[i-1][0] %((int)Math.pow(10,9)+7);
            dp[i][1]+= dp[i-1][2] %((int)Math.pow(10,9)+7);
            dp[i][2]+= dp[i-1][1]% ((int)Math.pow(10,9)+7); //dp[i-1][3]
            dp[i][2]+= dp[i-1][3]% ((int)Math.pow(10,9)+7); //dp[i-1][3]
            dp[i][3] = dp[i-1][2] % ((int)Math.pow(10,9)+7);
            dp[i][4] += (dp[i-1][2])% ((int)Math.pow(10,9)+7); //dp[i-1][3]
            dp[i][4] += (dp[i-1][3])% ((int)Math.pow(10,9)+7); //dp[i-1][3]
        }

        Long res = 0l;
        Long t =0l;
        for(long x : dp[n-1]){
            t += (x) % 1000000007;
        }
        res = (t+res) %1000000007;
        return res.intValue() ;

    }
}
