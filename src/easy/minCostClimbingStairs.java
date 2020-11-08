package easy;
/*
* 数组的每个索引作为一个阶梯，第 i个阶梯对应着一个非负数的体力花费值 cost[i](索引从0开始)。
每当你爬上一个阶梯你都要花费对应的体力花费值，然后你可以选择继续爬一个阶梯或者爬两个阶梯。
您需要找到达到楼层顶部的最低花费。在开始时，你可以选择从索引为 0 或 1 的元素作为初始阶梯
*/
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
