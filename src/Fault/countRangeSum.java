package Fault;
/*
* 给定一个整数数组 nums，返回区间和在 [lower, upper] 之间的个数，包含 lower 和 upper。
区间和 S(i, j) 表示在 nums 中，位置从 i 到 j 的元素之和，包含 i 和 j (i ≤ j)。
*/

public class countRangeSum {
    public int countRangeSum(int[] nums, int lower, int upper) {
        long[] sum=new long[nums.length];
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i==0)
                sum[i]=nums[i];
            else
                sum[i]=sum[i-1]+nums[i];
        }
        sort(sum);
        for(int i=0;i<sum.length;i++)
        {
            count+=getRange(sum[i]-lower,sum)-getRange(sum[i]-upper,sum);
        }
        return count;

    }
    public int getRange(long m,long[] sum) {
        int min=0;
        int res=0;
        int max=sum.length-1;
        int mid=0;
        while(min<max)
        {
            mid=(min+max)/2;
            if(m>sum[mid])
            {
                min=mid+1;
            }
           else if(m==sum[mid])
            {
                return mid+1;
            }
            else
                max=mid-1;
        }
        res=min;
        if(m>sum[min]&&min<=sum.length-1)
        {
            res++;
        }
        else if(m<sum[min]&&min>0)
            res--;
        return res;
    }

    private void sort(long[] sum) {
        for(int i=0;i<sum.length-1;i++)
        for(int j=i+1;j<sum.length;j++)
        {
            if(sum[i]>sum[j])
            {
                long t=sum[i];
                sum[i]=sum[j];
                sum[j]=t;
            }
        }
    }
}
