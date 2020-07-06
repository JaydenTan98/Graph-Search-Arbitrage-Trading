package dataProvider;
import java.util.*;

public class TestData {
    List<RateData> rates;

    public TestData() {
        rates = new ArrayList<>();

        rates.add(new RateData("USD", "EUR", -1*Math.log(0.741)));
        rates.add(new RateData("USD", "GBP", -1*Math.log(0.657)));
        rates.add(new RateData("USD", "CHF", -1*Math.log(1.061)));
        rates.add(new RateData("USD", "CAD", -1*Math.log(1.008)));

        rates.add(new RateData("EUR", "USD", -1*Math.log(1.349)));
        rates.add(new RateData("EUR", "GBP", -1*Math.log(0.888)));
        rates.add(new RateData("EUR", "CHF", -1*Math.log(1.433)));
        rates.add(new RateData("EUR", "CAD", -1*Math.log(1.366)));

        rates.add(new RateData("GBP", "USD", -1*Math.log(1.521)));
        rates.add(new RateData("GBP", "EUR", -1*Math.log(1.126)));
        rates.add(new RateData("GBP", "CHF", -1*Math.log(1.614)));
        rates.add(new RateData("GBP", "CAD", -1*Math.log(1.538)));

        rates.add(new RateData("CHF", "USD", -1*Math.log(0.942)));
        rates.add(new RateData("CHF", "EUR", -1*Math.log(0.698)));
        rates.add(new RateData("CHF", "GBP", -1*Math.log(0.619)));
        rates.add(new RateData("CHF", "CAD", -1*Math.log(0.953)));

        rates.add(new RateData("CAD", "USD", -1*Math.log(0.995)));
        rates.add(new RateData("CAD", "EUR", -1*Math.log(0.732)));
        rates.add(new RateData("CAD", "GBP", -1*Math.log(0.650)));
        rates.add(new RateData("CAD", "CHF", -1*Math.log(1.049)));
    }

    public List<RateData> getRates() {
        return this.rates;
    }

    public class RateData {
        String start;
        String end;
        double rate;

        public RateData(String start, String end, double rate) {
            this.start = start;
            this.end = end;
            this.rate = rate;
        }

        public double getRate() {
            return this.rate;
        }

        public String getStart() {
            return this.start;
        }

        public String getEnd() {
            return this.end;
        }
    }
}