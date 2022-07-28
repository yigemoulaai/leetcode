package AlwaysCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @Author ACER
 * @Date:2022/3/26
 */
public class mt02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<Integer, Integer> map =new HashMap<>();
        int[] nums =new int[n];
        for(int i =0 ;i < n ;i++){
            nums[i] = scanner.nextInt();
            map.put(nums[i], i);
        }
        int mid = (nums[0] + nums[nums.length-1]+1)/2;
        int i =0;
        while (!map.containsKey(mid+i) && !map.containsKey(mid - i))
        {
            i++;
        }
        int t = 0;
        if(map.containsKey(mid+i))
        {
            t = mid + i;
            System.out.println( Math.abs((t- nums[0]) - (nums[nums.length -1] -t)));
        }

        else {
            t = mid - i;
            System.out.println( Math.abs((t- nums[0]) - (nums[nums.length -1] -t)));
        }
    }
}
