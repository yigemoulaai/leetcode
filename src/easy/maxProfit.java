package easy;
/*maxProfit
* 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
设计一个算法来计算你所能获取的最大利润。
你可以尽可能地完成更多的交易（多次买卖一支股票）。

maxProfit2
给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
如果你最多只允许完成一笔交易（即买入和卖出一支股票一次），设计一个算法来计算你所能获取的最大利润。
*/
public class maxProfit {
    public int maxProfit(int[] prices) {
        int i=0;
        int flag=0;
        int sum=0;
        if(prices.length<2)
            return sum;
        while(i<prices.length-1)
        {
            if(prices[i]<prices[i+1])
            {
                i++;
            }
            else if(prices[i]>=prices[i+1])
            {
                sum+=prices[i]-prices[flag];
                flag=i+1;
                i++;
            }
        }
        if(prices[i]>prices[i-1])
        {
            sum+=prices[i]-prices[flag];
        }
        return sum;
    }
    public int maxProfit2(int[] prices){
        int sum=0;
        if(prices.length<2)
            return sum;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]>min)
            {
                max=Integer.max(max,prices[i]-min);
            }
            min=Integer.min(min,prices[i]);

        }
        sum=max;
        return sum;
    }
}
