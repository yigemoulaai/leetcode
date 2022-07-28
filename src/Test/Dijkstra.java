package Test;

import java.util.ArrayList;
import java.util.List;
class Edge{
    int to;
    int point;
    int weight;
}
public class Dijkstra {
    public int getMinPath ( int[][] drivingTimes) {
        List<Edge> list =new ArrayList<>();
        int n = drivingTimes[0].length;
        int[] dis =new int[n];
        int[] book =new int[n];
        for(int i =0;i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (drivingTimes[i][j] > 0) {
                    Edge edge = new Edge();
                    edge.point = i;
                    edge.to = j;
                    edge.weight = drivingTimes[i][j];
                    list.add(edge);
                }
            }
        }
            for(int i=0 ;i <n ;i++){
                if(drivingTimes[0][i] == -1){
                    dis[i] = Integer.MAX_VALUE;
                }
                else{
                    dis[i] = drivingTimes[0][i];
                }
            }
            dis[0] =0;
            for(int i = 1 ;i < n ;i++){
                int min = Integer.MAX_VALUE;
                int sign =0;
                for(int j = 1; j < n ;j++){
                    if(book[j] == 0 && dis[j] < min){
                        min = dis[j];
                        sign =j;
                    }
                }
                book[sign] =1;
                for(int k =0; k< list.size(); k++)
                {
                    Edge e =list.get(k);
                    if(e.point == sign){
                        if(dis[e.to] > dis[sign] +e.weight){
                            dis[e.to] = dis[sign] + e.weight;
                        }
                    }
                }
            }
            int len =dis[n-1];

        return 0;

    }
}
