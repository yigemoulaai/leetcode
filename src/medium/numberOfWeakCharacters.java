package medium;

import java.util.Arrays;
import java.util.Comparator;


/*
 * 1 第一步先对 攻击值排逆序
 * 2 如果对相同的防御值 正向排序
 * 3 一次遍历数组 找出当前最大的防御值，如果当前防御值小于maxDef 则是弱数据
*/

public class numberOfWeakCharacters {
    public int numberOfWeakCharacters(int[][] properties) {
        int res =0;
        Arrays.sort(properties, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] == o2[0] ? o1[1] -o2[1]: o2[0]-o1[0];
            }
        });
        int maxDef = properties[0][1];
        for(int[] p :properties){
            if(p[1] < maxDef){
                res++;
            }else {
                maxDef = p[1];
            }
        }
        return res;
    }
}
