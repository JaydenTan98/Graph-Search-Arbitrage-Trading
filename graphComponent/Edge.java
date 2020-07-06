package graphComponent;

public class Edge {
    private String from;
    private String to;
    private double weight;

    public Edge(String from, String to, double weight) {
        this.from = from;
        this.to = to;
        this.weight = weight;
    }

    public String getFromNode() {
        return this.from;
    }

    public String getToNode() {
        return this.to;
    }

    public double getWeight() {
        return this.weight;
    }
}