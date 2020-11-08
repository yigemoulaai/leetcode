package graph;



import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Vertex <T>{
    private T label;//顶点名称
    private Map<T, Vertex<T>> vertexMap;
    private List<Edge> edgeList;
    private boolean visited;
    private Vertex preVertex;
    private double cost;
    public boolean connect(Vertex endVertex,double weight){
        Iterator<Edge> iterator=getEdgeIterator();
        Edge edge=null;
        Vertex vertex=null;
        if(iterator==null)
        {
            edgeList=new LinkedList<>();
            edge=new Edge(this,endVertex, weight);
            edgeList.add(edge);
            //如果顶点没有与endVertex相连，则互相连接，返回true
        }
        else
        {
            while(iterator.hasNext()){
                edge=iterator.next();
                vertex=edge.getEndVertex();
                if(vertex.equals(endVertex)){
                    //如果顶点已经与endVertex连接，那么将会更新权值，返回false
                    edge.setWeight(weight);
                    return false;
                }

            }
            edge=new Edge(this,endVertex, weight);
            edgeList.add(edge);
        }
        return true;
    }

    public Iterator<Edge> getEdgeIterator() {
        if(edgeList==null)
            return null;
        return edgeList.iterator();
    }

    public Vertex(T label, double cost) {
        this.label = label;
        this.cost = cost;
    }

    public T getLabel() {
        return label;
    }

    public void setLabel(T label) {
        this.label = label;
    }

    public List<Edge> getEdgeList() {
        return edgeList;
    }

    public void setEdgeList(List<Edge> edgeList) {
        this.edgeList = edgeList;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public Vertex getPreVertex() {
        return preVertex;
    }

    public void setPreVertex(Vertex preVertex) {
        this.preVertex = preVertex;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
    public boolean equals(Object vertex)
    {
        boolean result;
        //如果otherVertex为空或者类不同，直接返回false
        if(vertex==null||getClass()!=vertex.getClass()){
            return false;
        }
        Vertex other=(Vertex)vertex;
        result=label.equals(other.label);
        return result;

    }
    //遍历查找是否这两个点相邻 找到则返回边 没找到返回null
    public Edge hasNeighbourVertex(Vertex<T> vertex) {
        Iterator<Edge> iterator=getEdgeIterator();
        Edge edge=null;
        Vertex<String> vertex1=null;
        while(iterator.hasNext())
        {
            edge=iterator.next();
            vertex=edge.getEndVertex();
            if(vertex.equals(vertex))
            {
                return edge;
            }

        }
        return null;
    }
}
