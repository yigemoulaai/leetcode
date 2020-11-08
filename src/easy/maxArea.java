package easy;

public class maxArea {
    public int maxArea(int[] height) {
        int min=0;
        int max=height.length-1;
        int maxV=-1;
        if(height.length<2)
            return 0;
        while(min<max)
        {
            maxV=Integer.max((max-min)*Integer.min(height[min],height[max]),maxV);
            if(height[min]<=height[max])
                min++;
            else
                max++;
        }
        return maxV;
    }
}
