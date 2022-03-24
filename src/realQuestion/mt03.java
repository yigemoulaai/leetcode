package AlwaysCode;

import java.util.*;

/**
 * @Author ACER
 * @Date:2022/3/12
 */
public class mt03 {
    public static void main(String[] args) {
        int res = 0;
        Scanner scanner =new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[][] v = new int[N][2];
        boolean[] flag =new boolean[M+1];
        for(int i  =0 ;i < M+1 ;i++ )
        {
            flag[i] = true;
        }
        for(int i =0 ;i < N; i++){
            int min = scanner.nextInt();
            int max= scanner.nextInt();
            if(min < max){
                v[i][0] =min;
                v[i][1] = max;
            }
            else{
                v[i][0] =max;
                v[i][1] = min;
            }
        }

        for(int i = 0 ; i < N ;i++)
        {
            if( !flag[v[i][0]] || !flag[v[i][1]])
                continue;
            else {
                res++;
                flag[v[i][0]] = true;
                flag[v[i][1]] = true;
            }
        }
        System.out.println(res);
    }
}
