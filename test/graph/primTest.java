package graph;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class primTest {

    @Test
    public void generateprim() {
        Graph<String> graph=new Graph<>(false);
        graph.addVertex("one", 0);
        graph.addVertex("two", 0);
        graph.addVertex("three", 0);
        graph.addVertex("four", 0);
        graph.addVertex("five", 0);
        graph.addEdge("one", "two", 1);
        graph.addEdge("one", "three", 4);
        graph.addEdge("one", "four", 4);
        graph.addEdge("one", "five", 5);
        graph.addEdge("two", "one", 1);
        graph.addEdge("two", "three", 3);
        graph.addEdge("two", "four", 7);
        graph.addEdge("two", "five", 5);
        graph.addEdge("three", "one", 4);
        graph.addEdge("three", "two", 3);
        graph.addEdge("three", "four", 6);
        graph.addEdge("four", "one", 4);
        graph.addEdge("four", "two", 7);
        graph.addEdge("four", "three", 6);
        graph.addEdge("four", "five", 2);
        graph.addEdge("five", "one", 5);
        graph.addEdge("five", "two", 5);
        graph.addEdge("five", "four", 2);
       // graph.printGraph();
        prim prim=new prim();

        List<Edge> edges=prim.generateprim(graph,"two");
        for (Edge edge:edges
             ) {
            System.out.println("起点"+edge.getBeginVertex().getLabel()+"终点"+edge.getEndVertex().getLabel()+"权值"+edge.getWeight());
        }
        //graph.removeEdge("first", "second");

    }
}