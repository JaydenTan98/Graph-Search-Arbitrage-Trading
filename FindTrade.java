import dataProvider.TestData;
import dataProvider.TestData.RateData;
import graphComponent.Edge;
import graphComponent.Node;
import graphComponent.Graph;
import java.util.*;

public class FindTrade {

    public static void main(String[] args) {
        // call data provider to get the rates of all trading pairs
        TestData data = new TestData();
        List<RateData> rates = data.getRates();
        List<String> currencies = data.getCurrencies();

        List<Edge> edgeList = new ArrayList<>();
        List<Node> nodeList = new ArrayList<>();

        // build the edges with the rates
        for(RateData rate : rates) {
            Node startNode = new Node(rate.getStart());
            Node endNode = new Node(rate.getEnd());
            double tradeRate = rate.getRate();

            edgeList.add(new Edge(startNode, endNode, tradeRate));
        }
        
        // build tthe nodes with the currencies
        for(String currency : currencies) {
            nodeList.add(new Node(currency));
        }

        Graph graph = new Graph();
        List<Node> cycleList = graph.bellmanFord(edgeList, nodeList);

        if(cycleList.size() <= 1) {
            System.out.print("No trading opportunity");
        }
        else {
            for(Node node : cycleList) {
                System.out.print(node.getCurrencyName() + "\n");
            }
        }
    }
}