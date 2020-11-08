package booknote.GraphChapter;

public class DFSearchLoop {
    private boolean[] marked;
    private int count;
    public DFSearchLoop(Graph G, int s)
    {
     marked=new boolean[G.getV()];
     dfs(G,s);
    }
    //深度优先搜索利用递归的比较好理解
    private void dfs(Graph g, int s) {
        marked[s]=true;
        count++;
        for(int w:g.getAdj(s))
            if(!marked[w])
                dfs(g,w);
    }
    public boolean marked(int n){
        return marked[n];
    }
    public int getCount() {
        return count;
    }
}
