package booknote.GraphChapter;

import java.util.Stack;
//栈适用于层次遍历
public class DFSearchStack {
    private boolean[] marked;
    private int count;

    public DFSearchStack(Graph G,int s) {
        marked=new boolean[G.getV()];
        dfs(G,s);
    }

    private void dfs(Graph g, int s) {
        Stack<Integer> stack=new Stack<>();
        stack.push(s);
        for(int w:g.getAdj(s))
        {
            if(marked[w]==false)
            {
                marked[w]=true;
                stack.pop();
                for(int k:g.getAdj(w))
                {

                }
            }
        }
    }
}
