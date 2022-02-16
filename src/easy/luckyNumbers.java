package easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Author ACER
 * @Date:2022/2/16
 */
public class luckyNumbers {
    public List<Integer> luckyNumbers (int[][] matrix) {
        Set<Integer> row =new HashSet<>();
        List<Integer> res =new ArrayList<>();
        for(int i=0; i < matrix.length;i++){
            int min =Integer.MAX_VALUE;
            for(int x : matrix[i]){
                if(x < min){
                    min = x;
                }
            }
            row.add(min);
        }
        for(int i =0 ;i < matrix[0].length; i++){
            int max = 0;
            for(int j =0; j < matrix.length;j++){
                if(matrix[j][i] > max)
                    max = matrix[j][i];
            }
            if(row.contains(max)){
                res.add(max);
            }
        }
        return res;
    }
}
