package graph;

import java.util.*;

public class prim {
    public List<Edge> generateprim(Graph graph,String first)
    {
        List<Edge> result=new LinkedList<>();
        HashMap<Vertex<String>,Edge> hashMap=new HashMap<>();
        Iterator<Vertex<String>> iterable=graph.getVertexIterator();
        Vertex<String> vertex;
        Edge edge;
        while (iterable.hasNext())//找到所有要添加进结果的端点
        {
            Vertex<String> vertex1=iterable.next();
            Edge edge1=new Edge(vertex1,vertex1,Double.MAX_VALUE);
            hashMap.put(vertex1,edge1);//全部把自身的回环添加进去
        }
        Map<String,Vertex<String>> vertexMap=graph.getVertexMap();//得到一个string 和 vertex的映射表
        vertex=vertexMap.get(first); //找到初始节点
        if(vertex==null)  //如果为空，则返回没有该节点
        {
            System.out.println("no this vertex"+first);
            return result;
        }
        List<Vertex<String>> canvertex=new LinkedList<>();
        canvertex.add(vertex);
        hashMap.remove(vertex);
        while(!hashMap.isEmpty())
        {
            Edge minedge=new Edge(vertex, vertex, Double.MAX_VALUE);
            for (Vertex<String> vertex1:canvertex) {
                List<Edge> list=vertex1.getEdgeList();
                //System.out.println(list.size());
                for (Edge edge1:list
                ) {
                    if(edge1.getWeight()<minedge.getWeight()&&hashMap.containsKey(edge1.getEndVertex()))
                        minedge=edge1;
                }
            }
            result.add(minedge);
            hashMap.remove(minedge.getEndVertex());
            canvertex.add(minedge.getEndVertex());
            }
            return result;
        }

    }


