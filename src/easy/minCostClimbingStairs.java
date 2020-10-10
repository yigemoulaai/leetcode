package easy;

public class minCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        int[] m=new int[cost.length];
        int i=0;
        m[0]=0;
        m[1]=Integer.min(cost[0],cost[1]);
        for(i=2;i<cost.length;i++)
        {
            m[i]=Integer.min(m[i-2]+cost[i-1],m[i-1]+cost[i]);
        }

        return m[i-1];
    }
}
