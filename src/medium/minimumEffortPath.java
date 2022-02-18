package medium;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @Author ACER
 * @Date:2022/2/16
 */
public class minimumEffortPath {
    public int minimumEffortPath(int[][] heights) {
        PriorityQueue<Edge> queue =new PriorityQueue<>(new Comparator<Edge>() {
            @Override
            public int compare(Edge o1, Edge o2) {
                return o1.weight - o2.weight;
            }
        });
        int m = heights.length;
        int n = heights[0].length;
        for(int i =0 ;i < m ;i++){
            for(int j =0 ;j < n ;j++)
            {
                int len = i* n +j;
                if(i > 0){
                    queue.add(new Edge(len -n, len, Math.abs(heights[i][j] - heights[i -1][j])));
                }
                if(j > 0) {
                    queue.add(new Edge(len - 1, len, Math.abs(heights[i][j] - heights[i][j-1])));
                }
            }
        }
        UnionFind uf =new UnionFind(m*n);
        while (queue.size()>0)
        {
            Edge edge = queue.poll();
            uf.union(edge.start,edge.end);
            if(uf.connected(0, m*n-1))
            {
                return  edge.weight;
            }
        }
        return 0;
    }
    class Edge{
        int start, end, weight;

        public Edge(int start, int end, int weight) {
            this.start = start;
            this.end = end;
            this.weight = weight;
        }
    }
}
class UnionFind{
    int[] parent; //根节点
    int[] size;
    int n;
    int setCount;  //联通分支数量

    public UnionFind(int n) {
        this.n = n;
        parent =new int[n];
        size= new int[n];
        setCount = n;
        Arrays.fill(size,1);
        for(int i =0; i< parent.length ;i++)
            parent[i] =i;
    }
    public int find(int x){
        while (parent[x] != x){
            x = parent[x];
        }
        return  x;
    }
    public boolean union(int x, int y){
        x = find(x);
        y= find(y);
        if( x == y)
        return false;
        //为什么交换size
        if(size[x]  < size[y]){
            int tmp =x;
            x =y;
            y =tmp;
        }
        parent[y] = x;
        size[x] += size[y];
        setCount--;
        return true;
    }
    //测试是否联通
    boolean connected(int x, int y){
        x = find(x);
        y =find(y);
        return  x == y;
    }
}