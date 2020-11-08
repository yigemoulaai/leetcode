package booknote.GraphChapter;

import java.util.Stack;

public class DFSPath {
    private boolean[] marked;
    private int[] edgeTo;
    private final int s;
    public DFSPath(Graph G,int s) {
        marked=new boolean[G.getV()];
        edgeTo=new int[G.getV()];
        this.s=s;
        dfs(G,s);
    }
    private void dfs(Graph g, int s) {
        marked[s]=true;
        for(int w:g.getAdj(s))
            if(!marked[w])
            {
                edgeTo[w]=s;
                dfs(g,w);
            }
    }
    public boolean hasPathTo(int v)
    {
        return marked[v];
    }
    public  Iterable<Integer> paths(int v){
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
}
