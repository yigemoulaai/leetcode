package booknote.GraphChapter;

import edu.princeton.cs.algs4.In;
import java.util.HashMap;
//标志图
public class SymbolGraph {
    public HashMap<String, Integer> hashMap;
    public String[] s;
    public Graph  g;
    public SymbolGraph(String filename,String delim) {
        hashMap=new HashMap<>();
        In in=new In(filename);
        while(in.hasNextLine())
        {
            String[] a=in.readLine().split(delim);
            for(int i=0;i<a.length;i++)
            {
                if(!hashMap.containsKey(a[i]))//这种构造方式很有效果
                {
                    hashMap.put(a[i],hashMap.size());
                }
            }
            s=new String[hashMap.size()];//构造反向索引
            int i=0;
            for(String name:hashMap.keySet())
            {
                s[i]=name;
                i++;
            }//建立索引的部分完成  下面继续要实现图的构造
            g=new Graph(hashMap.size());
            in=new In(filename);
            while(in.hasNextLine())
            {
                String[] sp=in.readLine().split(delim);
                int num=hashMap.get(sp[0]);
                for(int i1=1;i<sp.length;i1++)
                {
                    g.addEdge(num,hashMap.get(s[i1]));
                }
            }
        }
    }
    public boolean contain(String key)
    {
            return hashMap.containsKey(key);
    }
    public int index(String x){
            return hashMap.get(x);
    }
    public String name(int v){
            return s[v];
    }

}
