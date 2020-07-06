package dataProvider;
import java.util.*;

public class TestData {
    List<PriceData> prices;

    public TestData() {
        prices = new ArrayList<>();
        prices.add(new PriceData("USD", "EUR", -1*Math.log(0.741)));
        prices.add(new PriceData("USD", "GBP", -1*Math.log(0.657)));
        prices.add(new PriceData("USD", "CHF", -1*Math.log(1.061)));
        prices.add(new PriceData("USD", "CAD", -1*Math.log(1.008)));

        prices.add(new PriceData("EUR", "USD", -1*Math.log(1.349)));
        prices.add(new PriceData("EUR", "GBP", -1*Math.log(0.888)));
        prices.add(new PriceData("EUR", "CHF", -1*Math.log(1.433)));
        prices.add(new PriceData("EUR", "CAD", -1*Math.log(1.366)));

        prices.add(new PriceData("GBP", "USD", -1*Math.log(1.521)));
        prices.add(new PriceData("GBP", "EUR", -1*Math.log(1.126)));
        prices.add(new PriceData("GBP", "CHF", -1*Math.log(1.614)));
        prices.add(new PriceData("GBP", "CAD", -1*Math.log(1.538)));

        prices.add(new PriceData("CHF", "USD", -1*Math.log(0.942)));
        prices.add(new PriceData("CHF", "EUR", -1*Math.log(0.698)));
        prices.add(new PriceData("CHF", "GBP", -1*Math.log(0.619)));
        prices.add(new PriceData("CHF", "CAD", -1*Math.log(0.953)));

        prices.add(new PriceData("CAD", "USD", -1*Math.log(0.995)));
        prices.add(new PriceData("CAD", "EUR", -1*Math.log(0.732)));
        prices.add(new PriceData("CAD", "GBP", -1*Math.log(0.650)));
        prices.add(new PriceData("CAD", "CHF", -1*Math.log(1.049)));
    }

    public List<PriceData> getPrices() {
        return this.prices;
    }

    public class PriceData {
        String start;
        String end;
        double price;

        public PriceData(String start, String end, double price) {
            this.start = start;
            this.end = end;
            this.price = price;
        }

        public double getPrice() {
            return this.price;
        }
    }
}