package graphComponent;

public class Node {

    private String currencyName;
    private double minDistance;

    public Node(String currencyName) {
        this.currencyName = currencyName;
        this.minDistance = Integer.MAX_VALUE;
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
}