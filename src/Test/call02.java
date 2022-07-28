package Classic200;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author ACER
 * @Date:2022/3/19
 */
public class call02 {
    public static void main(String[] args) {
        int[] num = {1,2,4,3};
        int N = 10;
        int[][] op ={{1,3},{0,2},{1,3}};
        int max =0;
        int index =0;
        for(int i =0;i < op.length ;i++){
            if(max < op[i][1]){
                max = op[i][1];
                index = i;
            }
        }
        if(op[index][0] == 0)Arrays.sort(num,0,max);
        else {
            revers(num,max);
        }
        for(int i= index+1 ;i < op.length ;i++)
        {
            if(op[i][0] == 0)Arrays.sort(num,0,op[i][1]);
            else {
                revers(num,op[i][1]);
            }
        }
        for(int x :num)System.out.print(x +" ");

    }

    private static void revers(int[] num, int index) {
        for(int i =0 ;i < index; i++){
            for(int j = i+1 ;j < index;j++)
            {
                if(num[i] < num[j]){
                    int tmp =num[i];
                    num[i] =num[j];
                    num[j] =tmp;
                }
            }
        }
    }
}
