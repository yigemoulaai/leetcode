package easy;

import java.util.ArrayList;
import java.util.List;

public class NumArray {
    int[] num;
    public NumArray(int[] nums) {
        num=new int[nums.length+1];
        for(int i=0;i<nums.length;i++)
            num[i]=nums[i];
    }
    public int sumRange(int i, int j) {
        int sum=0;
        for(int k=i;k<=j;k++)
            sum+=num[k];
        return sum;
    }
}
