import dataProvider.TestData;
import dataProvider.TestData.RateData;
import graphComponent.Edge;
import graphComponent.Node;
import java.util.*;

public class FindTrade {

    public static void main(String[] args) {
        // call data provider to get the rates of all trading pairs
        TestData data = new TestData();
        List<RateData> rates = data.getRates();
        List<String> currencies = data.getCurrencies();
        List<Edge> edgeList = new ArrayList<>();
        List<Node> nodeList = new ArrayList<>();

        // build the edges with the price 
        for(RateData rate : rates) {
            Node startNode = new Node(rate.getStart());
            Node endNode = new Node(rate.getEnd());
            double tradeRate = rate.getRate();

            edgeList.add(new Edge(startNode, endNode, tradeRate));
        }
        
        for(String currency : currencies) {
            nodeList.add(new Node(currency));
        }

        for(Node node : nodeList) {
            System.out.print(node.getCurrencyName());
        }

        // call bellmand ford algorithm (which contains cycle detection algorithm)
        
        // return the path of the trade with the calculated profit
    }
}