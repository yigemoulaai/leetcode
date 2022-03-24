package AlwaysCode;

import java.util.Scanner;

/**
 * @Author ACER
 * @Date:2022/3/12
 */
public class mt02 {
    public static void main(String[] args) {
        int res =0;
        Scanner scanner =new Scanner(System.in);
        int n = scanner.nextInt();
        int[] no =new int[n];
        for(int i =0 ; i  < n ;i++)
        {
            no[i] = scanner.nextInt();
        }
        int[][] dp =new int[n][n];
        for(int i =0 ;i < n ;i++)
        {
            dp[i][i] = no[i];
            if(dp[i][i] == 1){
                res++;
            }
        }
        for(int i =0 ;i < n ;i++)
        {
            for(int len =2; len <= n ;len++)
            {
                int right =i + len -1;
                if(i+len > n )
                    break;
                dp[i][right] = dp[i][right-1] * no[right];
                if(dp[i][right] == 1){
                    res++;
                }
            }
        }
        System.out.println(res);

    }
}
