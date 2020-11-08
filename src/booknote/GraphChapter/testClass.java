package booknote.GraphChapter;

import edu.princeton.cs.algs4.In;

public class testClass {
    public static void main(String[] args) {
        Graph g=new Graph(new In(args[0]));
        int s=Integer.parseInt(args[1]);
       /* DFSearchLoop dfSearchLoop =new DFSearchLoop(g,s);
        for(int i=0;i< g.getV();i++)
        {
            if(dfSearchLoop.marked(i))
                System.out.print(i+"  ");
    }
    System.out.println();
        if(dfSearchLoop.getCount()!= g.getV())
            System.out.print("Not ");
         System.out.println("connect");*/
       System.out.println(new TwoColor(g).isSameColor);
    }
}
