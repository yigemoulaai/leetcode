package Review;

import java.util.Arrays;

/**
 * @Author ACER
 * @Date:2022/4/16
 */
public class giveGem {
    public int giveGem(int[] gem, int[][] op) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i =0 ;i < op.length ;i++){
            int tmp = gem[op[i][0]] /2;
            gem[op[i][0]] -= tmp;
            gem[op[i][1]] += tmp;
           /* min = Math.min(min,gem[op[i][0]]);
            max = Math.max(max,gem[op[i][1]]);*/
        }
        Arrays.sort(gem);

        return gem[gem.length -1] - gem[0];
    }

    public static void main(String[] args) {
        int[] gem = {3,1,2};
        int[][] op = {{0,2},{2,1},{2,0}};
        System.out.println(new giveGem().giveGem(gem, op));
    }
}
