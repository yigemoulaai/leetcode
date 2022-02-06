package medium;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author ACER
 * @Date:2022/2/6
 */
public class sumOfUnique {
    public int sumOfUnique(int[] nums) {
        int sum =0 ;
        int count =0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int x : nums){
            map.put(x, map.getOrDefault(x, 0)+1);
            if(map.get(x) == 1){
                sum += x;
            }
            else if(map.get(x) == 2){
                sum -=x;
            }
        }
        return sum;
    }
}
