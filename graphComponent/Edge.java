package graphComponent;

public class Edge {
    private Node from;
    private Node to;
    private double weight;

    public Edge(Node from, Node to, double weight) {
        this.from = from;
        this.to = to;
        this.weight = weight;
    }

    public Node getFromNode() {
        return this.from;
    }

    public Node getToNode() {
        return this.to;
    }

    public double getWeight() {
        return this.weight;
    }
}