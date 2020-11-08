package booknote.GraphChapter;

import edu.princeton.cs.algs4.In;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BFSearch {
    public  final int s;
    public boolean marked[];
    public int[] edgeTo;
    public BFSearch(Graph G, int s){
        marked=new boolean[G.getV()];
        edgeTo=new int[G.getV()];
        this.s=s;
        bfs(G,s);
    }

    private void bfs(Graph g, int s) {
        Queue<Integer> queue=new LinkedList<>();
        marked[s]=true;
        queue.add(s);
        while (!queue.isEmpty())
        {
            int num=queue.poll();
            for(int x:g.getAdj(num))
            {
                if(marked[x]!=true)
                {
                    queue.add(x);
                    marked[x]=true;
                    edgeTo[x]=num;
                }
            }
        }

    }
    public  Iterable<Integer> paths(int v)
    {
        if(!hasPathTo(v))
            return null;
        Stack<Integer> path=new Stack<>();
        for(int x=v;x!=s;x=edgeTo[x])
        {
            path.push(x);
        }
        path.push(s);
        return path;
    }

    private boolean hasPathTo(int v) {
        return marked[v];
    }
}
