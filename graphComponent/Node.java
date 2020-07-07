package graphComponent;

public class Node {

    private String currencyName;
    private double minDistance;
    private Node previousNode;

    public Node(String currencyName) {
        this.currencyName = currencyName;
        this.minDistance = Integer.MAX_VALUE;
        this.previousNode = null;
    }

    public double getMinDistance() {
        return this.minDistance;
    }

    public void setMinDistance(double minDistance) {
        this.minDistance = minDistance;
    }

    public String getCurrencyName() {
        return this.currencyName;
    }

    public Node getPreviousNode() {
        return this.previousNode;
    }

    public void setPreviousNode(Node node) {
        this.previousNode = node;
    }
}