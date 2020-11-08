package booknote.GraphChapter;

import edu.princeton.cs.algs4.In;

public class Graph {
    private final int V;///顶点个数
    private  int E;//边的个数
    private Bag<Integer>[] adj;
    Graph(int V){
        this.V=V;
        this.E=0;
        adj=(Bag<Integer>[]) new Bag[V];
        for(int i=0;i<V;i++)
        {
            adj[i]=new Bag<Integer>();
        }
    }
    public Graph(In in) {
        this(in.readInt());
        int E=in.readInt();
        for(int i=0;i<E;i++)
        {
            int v=in.readInt();
            int w=in.readInt();
            addEdge(v,w);
        }
    }

    public int getV() {
        return V;
    }

    public int getE() {
        return E;
    }

    public void addEdge(int v, int w) {
        adj[v].add(w);
        adj[w].add(v);
        E++;
    }
    public Iterable<Integer> getAdj(int v)
    {
        return adj[v];
    }
}
