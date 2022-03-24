package AlwaysCode;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @Author ACER
 * @Date:2022/3/12
 */
public class mt04 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] boom =new int[M];
        for(int i =0 ;i < M; i++){
            boom[i] = scanner.nextInt();
        }
        System.out.println(find(N, boom));
    }

    private static int find(int n, int[] boom) {
        int N = boom.length;
        int room =1;
        int res =0;
        Map<Integer, Integer> map =new HashMap<>();
        for( int i =0 ; i<N ;i++){
            if(boom[i] == room){
                res++;
                for(int j =i ; j < N; j++){
                    if(map.containsKey(boom[j])){
                        map.put(boom[j],map.get((boom[j])+1));
                    }else {
                        map.put(boom[j],1);
                    }
                    if(map.size() ==n){
                        room = boom[j];
                        map.clear();
                        break;
                    }
                }
                if(room == boom[i])
                  return  res;
            }
        }
        return res;
     }
}
