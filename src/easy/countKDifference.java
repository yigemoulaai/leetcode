package easy;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class countKDifference {
    public int countKDifference(int[] nums, int k){
        if(k < 0) k = -k;
        int sum =0;
        Map<Integer, Integer> map =new HashMap<>();
        for(int x : nums){
            map.put(x, map.getOrDefault(x, 0)+1);
        }
        Iterator<Integer> iterator = map.keySet().iterator();
        while (iterator.hasNext()){
            int t =  iterator.next();
            int count = map.get(t);
            sum+= count* map.getOrDefault(t+k,0);
            sum+= count* map.getOrDefault(t-k,0);
        }
        return sum/2;
    }
}
