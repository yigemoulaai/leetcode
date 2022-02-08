package medium;

import java.util.Collection;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class longestDiverseString {
    public String longestDiverseString(int a, int b, int c) {
        Queue<int[]> queue =new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] n1, int[] n2) {
                return n2[1] - n1[1];
            }
        });
        StringBuffer sb = new StringBuffer();
        if(a > 0) queue.add(new int[]{0,a});
        if(b > 0) queue.add(new int[]{1,b});
        if(c > 0) queue.add(new int[]{2,c});
        int[] last = {-1,-1};
        int i =0;
        while (queue.size() > 0){
            int[] num =queue.poll();
            if(i < 2){
                last[i++] = num[0];
                sb.append( (char) ('a'+num[0]));
               if(num[1] > 1){
                   num[1] = num[1] -1;
                   queue.add(new int[]{num[0], num[1]});
               }
            }
            else {
                if(last[0] == last[1] && last[0] == num[0]){
                    int[] tmp ={num[0],num[1]};
                    if (queue.size() > 0){
                        num = queue.poll();
                        if(num[1] > 1){
                            num[1] = num[1] -1;
                            queue.add(new int[]{num[0], num[1]});
                        }
                    }
                    else {
                        break;
                    }
                   queue.add(tmp);
                }
                    sb.append((char) ('a'+num[0]));
                    last[0] = last[1];
                    last[1] = num[0];
                    if(num[1] > 1){
                        num[1] = num[1] -1;
                        queue.add(new int[]{num[0], num[1]});
                    }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        new longestDiverseString().longestDiverseString(1,1,7);
    }
}
