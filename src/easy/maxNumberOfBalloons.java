package easy;

import java.util.HashMap;
import java.util.Map;

public class maxNumberOfBalloons {
    public int maxNumberOfBalloons(String text) {
        String ball= "balloon";
        int[] nums =new int[5];
        int res =Integer.MAX_VALUE;
        Map<Character,Integer> map = new HashMap<>();
        for(char ch : ball.toCharArray()){
            map.put(ch,map.getOrDefault(ch ,0)+1);
        }
        for(char ch : text.toCharArray()){
           if(map.containsKey(ch))
               map.put(ch,map.get(ch)+1);
        }
        nums[0] = map.get('b');
        nums[1] = map.get('a');
        nums[2] = map.get('l')/2;
        nums[3] = map.get('o')/2;
        nums[4] = map.get('n');
        for(int x : nums)
        {
            res = Math.min(x,res);
        }
        return res-1;
    }
}
