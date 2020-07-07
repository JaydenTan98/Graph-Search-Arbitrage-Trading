package graphComponent;
import java.util.*;

public class Graph {

    public Graph() {

    }

    public List<Node> bellmanFord(List<Edge> edgeList, List<Node> nodeList) {

        int nodeCount = nodeList.size();

        // perform relaxation of all edges for nodeCount - 1 times
        for(int i = 0; i < nodeCount - 1; i++) {
            
            // relaxation
            for(Edge edge : edgeList) {
                Node startNode = edge.getFromNode();

                if(startNode.getMinDistance() == Integer.MAX_VALUE) continue;

                double newDistance = startNode.getMinDistance() + edge.getWeight();
                if(newDistance < edge.getToNode().getMinDistance()) {
                    edge.getToNode().setMinDistance(newDistance);
                    edge.getToNode().setPreviousNode(startNode);
                }

            }
        }

        List<Node> cycleList = new ArrayList<>();

        // perform one more relaxation to detect negative cycle
        for(Edge edge : edgeList) {
            // if there is cycle then build the list of currencies for the cycle
            if(hasCycle(edge)) {
                
                Node node = edge.getFromNode();

                while(!node.equals(edge.getToNode())) {
                    cycleList.add(node);
                    node = node.getPreviousNode();
                }

                cycleList.add(edge.getToNode());
            }
        }

        return cycleList;
    }

    // it has negative cycle if the edge can still be relaxed
    public boolean hasCycle(Edge edge) {
        double newDistance = edge.getFromNode().getMinDistance() + edge.getWeight();
        return newDistance < edge.getToNode().getMinDistance();
    }
}