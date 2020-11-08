package easy;
/*
* 我们把数组 A 中符合下列属性的任意连续子数组 B 称为 “山脉”：
B.length >= 3
存在 0 < i < B.length - 1 使得 B[0] < B[1] < ... B[i-1] < B[i] > B[i+1] > ... > B[B.length - 1]
（注意：B 可以是 A 的任意子数组，包括整个数组 A。）
*/
public class longestMountain {
    public int longestMountain(int[] A) {
        if(A.length==0||A.length==1||A.length==2)
            return 0;
        int length=A.length;
        int flag=1;
        boolean flag1=false;
        int[] dp=new int[length-1];
        for(int i=0;i<length-1;++i)
        {
            if(A[i+1]>A[i])
                dp[i]=1;
            else if(A[i+1]<A[i])
                dp[i]=-1;
            else dp[i]=0;
        }
        int max=0;
        int j=0;
        for(int i=0;i<length-2;)
        {
            if(dp[i]!=1) i++;
            else {
                j=i;
                flag1=false;
                while(j<=length-2){
                    if(dp[j]==1&&flag==1) j++;
                    else if(dp[j]==-1)
                    {
                        flag=-1;
                        j++;
                        max=Integer.max(max,j-i+1);
                        flag1=true;
                    }
                    else if(dp[j]==1&&flag==-1)
                    {
                        break;
                    }
                    else if(dp[j]==0)
                    {
                        j++;   break;
                    }

                }
                i=j;
                flag=1;
            }
        }
        return max;
    }
}
