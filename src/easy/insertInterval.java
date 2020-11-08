package easy;

/*leetcode 57插入区间
* 给出一个无重叠的 ，按照区间起始端点排序的区间列表。
在列表中插入一个新的区间，你需要确保列表中的区间仍然有序且不重叠（如果有必要的话，可以合并区间）。*/
import java.util.Arrays;


public class insertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n=intervals.length;
        int[][] res=new int[n+1][2];
        int i=0;
        int k=0;
        while(i<n&&newInterval[0]>intervals[i][1])
        {
            res[k++]=intervals[i++];
        }
        while(i<n&&newInterval[1]>=intervals[i][0])
        {
            newInterval[0]=Integer.min(newInterval[0],intervals[i][0]);
            newInterval[1]=Integer.max(newInterval[1],intervals[i][1]);

            i++;
        }
        res[k++]=newInterval;
        while (i<n&&!check(intervals[i],newInterval))
        {
            res[k++]=intervals[i++];
        }
        return Arrays.copyOf(res,k);
    }
    private boolean check(int[] interval, int[] newInterval) {
        boolean flag=false;
        if(interval[0]<=newInterval[0]&&interval[1]>=newInterval[0]||
                newInterval[1]<=interval[1]&&interval[0]<=newInterval[1]
                ||newInterval[0]<=interval[0]&&newInterval[1]>=interval[1])
            flag=true;
        return flag;
    }
}
