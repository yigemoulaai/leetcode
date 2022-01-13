package easy;

import java.util.Arrays;

/**
 * @Author ACER
 * @Date:2022/1/13
 */
public class dominantIndex {
    public int dominantIndex(int[] nums) {
        if(nums.length ==1)
            return 0;
        int max=0;
        int mid =0;
        if(nums[0] >= nums[1]) {
            max = 0 ;
            mid =1;
        }else {
            mid =0;
            max =1;
        }
      for(int i =2 ; i< nums.length; i++){
          if(nums[max] < nums[i])
          {

              mid =max;
              max =i;
          }
          if(nums[mid] < nums[i] && max != i)
          {
              mid =i;
          }
      }
        if(nums[max] >= nums[mid]*2)
            return max;
        return  -1;
    }
}
