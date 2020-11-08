package graph;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Graph<T> {
    private Map<T,Vertex<T>> vertexMap;
    private int edgeCount;
    private boolean isDirect;

    public Graph(boolean isDirect) {
        this.isDirect = isDirect;
        edgeCount=0;
        vertexMap=new LinkedHashMap<>();
    }
    /** 返回图的顶点的迭代器
     */
    public Iterator<Vertex<T>> getVertexIterator(){
        return vertexMap.values().iterator();
    }
    public int getVertexCount(){
        return vertexMap.size();
    }
    //添加节点
    public boolean addVertex(T label,double cost){
        Vertex vertex=vertexMap.get(label);
        if(vertex!=null){
            //如果图中已经存在该节点，则更新权值，返回false
            vertex.setCost(cost);
            return false;
        }
        //如果图中不存在该节点，则插入，返回true
        vertex=new Vertex<T>(label, cost);
        vertexMap.put(label, vertex);
        return true;
    }
    //添加边
    public boolean addGraph(T beginver,T endver,double weight)
    {
        Vertex beginvertex=vertexMap.get(beginver);
        Vertex endvertex=vertexMap.get(endver);
        if(beginvertex==null||endvertex==null)
            return false;
        boolean result=beginvertex.connect(endvertex, weight);
        if(result){
            edgeCount++;
        }
        if(!isDirect){
            //如果不是有向图，则建立两条边,一条以end开始，到begin
            endvertex.connect(beginvertex, weight);
            if(result){
                edgeCount++;
            }
        }
        return result;

    }

    public Map<T, Vertex<T>> getVertexMap() {
        return vertexMap;
    }

    public void setVertexMap(Map<T, Vertex<T>> vertexMap) {
        this.vertexMap = vertexMap;
    }

    public int getEdgeCount() {
        return edgeCount;
    }

    public void setEdgeCount(int edgeCount) {
        this.edgeCount = edgeCount;
    }

    public boolean isDirect() {
        return isDirect;
    }

    public void setDirect(boolean direct) {
        isDirect = direct;
    }

    public boolean addEdge(T first, T third, double weight) {
        Vertex beginVertex=vertexMap.get(first);
        Vertex endVertex=vertexMap.get(third);
        if(beginVertex==null||endVertex==null){
            //如果没有以begin或者end标识的顶点，则直接返回false
            return false;
        }
        //有向图和无向图都要建立begin到end的边
        //如果顶点已经与endVertex连接，那么将会更新权值，result=false
        //如果顶点没有与endVertex相连，则互相连接，result=true
        boolean result=beginVertex.connect(endVertex, weight);
        if(result){
            edgeCount++;
        }
        if(!isDirect){
            //如果不是有向图，则建立两条边,一条以end开始，到begin
            endVertex.connect(beginVertex, weight);
            if(result){
                edgeCount++;
            }
        }
        return result;

    }
    public void printGraph(){
        Iterator<Vertex<T>> iteratorVertex=getVertexIterator();
        Iterator<Edge> iteratorEdge;
        Vertex<T> vertex;
        Edge edge;
        T label;
        System.out.println("图是否为有向图："+isDirect+"，图的顶点个数："+getVertexCount()+"，图的总边个数："+getEdgeCount());
        while(iteratorVertex.hasNext()){
            vertex=iteratorVertex.next();
            label=vertex.getLabel();
            iteratorEdge=vertex.getEdgeIterator();
            System.out.println("顶点："+label+"，以这个顶点为出发点的边的个数："+"，该顶点的权值为："+vertex.getCost());
            while(iteratorEdge.hasNext()){
                edge=iteratorEdge.next();
                System.out.print("边：从 "+label+" 到 "+edge.getEndVertex().getLabel()+" ，权值："+edge.getWeight()+"   ");
            }
            System.out.println();
        }
        System.out.println();
    }

}
