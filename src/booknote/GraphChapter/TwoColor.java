package booknote.GraphChapter;

public class TwoColor {
    public boolean[] color;
    public boolean[] market;
    public boolean isSameColor=true;
    public TwoColor(Graph g)
    {
        color=new boolean[g.getV()];
        market=new boolean[g.getV()];
        for(int i=0;i<g.getV();i++)
        {
           if(!market[i]) dfs(g,i);
        }
    }

    private void dfs(Graph g, int i) {
        for(int n:g.getAdj(i))
        {
            if(!market[n])
            {
                market[n]=true;
                color[n]=!color[i];
                dfs(g,n);
            }
             if(color[n]==color[i])
                 isSameColor=false;

        }
    }
    public boolean isSameColor()
    {
        return isSameColor;
    }
}
