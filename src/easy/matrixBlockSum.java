package easy;

/*给你一个 m * n 的矩阵 mat 和一个整数 K ，请你返回一个矩阵 answer ，其中每个 answer[i][j] 是所有满足下述条件的元素 mat[r][c] 的和： 
i - K <= r <= i + K, j - K <= c <= j + K 
(r, c) 在矩阵内。
*/
public class matrixBlockSum {
    public int[][] matrixBlockSum(int[][] mat, int K) {
        if(mat.length==0)
            return null;
        int[][] sum=new int[mat.length][mat[0].length];
        int[][] sum1=new int[mat.length][mat[0].length];
        int m=mat.length;
        int n=mat[0].length;
        int lr,hr,lc,hc;
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                    {
                        if(i==0&&j>=1)
                        {
                            sum[i][j]=sum[i][j-1]+mat[i][j];
                        }
                        else if(j==0&&i>=1)
                        {
                            sum[i][j]=sum[i-1][j]+mat[i][j];
                        }
                        else if(j>=1&&i>=1)

                            sum[i][j]=sum[i-1][j]+sum[i][j-1]+sum[i-1][j-1]+mat[i][j];
                        System.out.println(sum[i][j]);
                    }
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++){
        lr=i-K>0?i-K:0;
        lc=j-K>0?j-K:0;
        hr=i+K<m-1?i+K:m-1;
        hc=j+K<n-1?j+K:n-1;
                if(lr>=1&&lc>=1)
                sum1[i][j]=sum[hr][hc]-sum[lr-1][hc]-sum[hr][lc-1]+sum[lc-1][lr-1];
                else if(lr<1&&lc>=1)
                    sum1[i][j]=sum[hr][hc]-sum[hr][lc-1]+sum[lc-1][lr-1];
                else if(lr>=1&&lc<1)
                    sum1[i][j]=sum[hr][hc]-sum[lr-1][hc]+sum[lc-1][lr-1];
                else sum1[i][j]=sum[hr][hc];
            }    return  sum1;

    }
}
